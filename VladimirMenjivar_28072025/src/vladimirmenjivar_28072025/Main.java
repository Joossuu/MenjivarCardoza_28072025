/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vladimirmenjivar_28072025;

/**
 *
 * @author UFG
 */
public class Main {

    /*Variables globales*/
    public static String nombres = "Josue Vladmir";
    public static String apellidos = "Menjivar Cardoza";
    public static int anio_nacimiento = 2000;
    public static int mes_nacimiento = 11;
    public static float estatura =1.33f;/*En metros*/
    public static float peso = 91.5f; /*Peso en libras*/
    public static char genero = 'M';
    public static String estado_familiar = "Ocupado";
    public static double salario_mensual = 420.69d;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasa_kilogramo = 0.453592f; /*1 libra equivales a eso*/
        int dias_laborales = 22; /*Dias que se trabajan*/
        int horas_laborales = 8; /*Horas laborales por dia*/
        
        //Convertir el peso de libras a kilogramos//
        float peso_kilogramos = Main.peso * tasa_kilogramo;
        
        //Elevando el valor de la estatura al cuadrado//
        float estatura_al_cuadrado = Main.estatura*Main.estatura;
        
        //Calcular el Indice De Masa Corporal
        imc = peso_kilogramos/estatura_al_cuadrado; 
        
        //Calculando el salario diario
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //Calculando el salario por hora//
        double salario_hora = salario_diario/horas_laborales;
        
        /*****************************************************/
        ///////////////////Salida de datos/////////////////////
        /*****************************************************/
        
        System.out.println("Saludos "+Main.nombres+" "+Main.apellidos);
        System.out.println("Su peso en libras es: "+Main.peso+", pero en kilogramos es:"+peso_kilogramos);
        System.out.println("Su indice de masa corporal es: "+imc);
        System.out.println("Su salario mensual es: "+Main.salario_mensual);
        System.out.println("Su salario diario es:"+salario_diario);
        System.out.println("Su salario por hora es:"+salario_hora);
    }
    
}
