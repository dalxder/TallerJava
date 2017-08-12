/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjava;

import java.util.Scanner;

/**
 *
 * @author dalxder
 * email dalxder@gmail.com
 * License: LGPL v3
 * 2017
 */
public class TallerJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int run=1;
        System.out.println("TALLER DE FUNDAMENTOS DE PROGRAMACIÓN\n"
                + "Ejercicios de practica\n");
        System.out.println("1. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.\n" +
            "We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in\n" +
            "trouble.\n" +
            "\n" +
            "2. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on\n" +
            "vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.\n" +
            "\n" +
            "3. Given two int values, return their sum. Unless the two values are the same, then return double\n" +
            "their sum.\n" +
            "\n" +
            "4. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.\n" +
            "\n" +
            "5. Given three int values, a b c, return the largest.\n" +
            "\n" +
            "6. Programa que cumple los siguientes requerimientos\n" +
            "a. Pregunta al usuario un numero inicial y un número final y este imprime los\n" +
            "números incrementando de a uno, iniciando en el numero inicial ingresado por el usuario y\n" +
            "terminando en el número final ingresado por el usuario.\n\n" +
            "7. Programa que cumple los siguientes requerimientos:\n" +
            "a. Solicita al usuario que ingrese 3 números.\n" +
            "b. Imprime la suma de los 3 números.\n" +
            "c. Imprime la resta de los 3 números.\n" +
            "d. Imprime la multiplicación de los 3 números.\n" +
            "e. Imprime la división de los 3 números.\n\n" +
            "8. Programa que imprime la serie de Fibonacci hasta un número indicado por el usuario.\n\n" +
            "9. Programa que dibuja un triángulo compuesto por asteriscos según una altura solicitada\n" +
            "al usuario.\n\n" +
            "10. Programa que dibuja un triángulo compuesto por una secuencia de números por cada\n" +
            "nivel según una altura solicitada al usuario, cada nivel es la secuencia de 1 hasta el número del\n" +
            "nivel.\n");               
        do{
            ejercicios();
            System.out.print("\nEscriba 0 para salir o 1 para continuar con otro ejercicio, otro valor producira error: ");
            run=new Scanner(System.in).nextInt();
            System.out.flush();

        }while(run==1);
        
        // TODO code application logic here
    }
    
    public static void ejercicios(){

        System.out.print("Digite número del ejercicio 1 a 10: ");
        //Scanner sc=new Scanner(System.in);
        int opcion=new Scanner(System.in).nextInt();
        switch (opcion){
            case 1: monkeyTrouble();
                    break;
            case 2: sleepIn();
                    break;
            case 3: 
                sumDouble();
                break;
            case 4: numero10();
                    break;
            case 5: numeroMax();
                    break;
            case 6: serieInitFinal();
                    break;
            case 7: tresNumeros();
                    break;
            case 8: fibonacci();
                    break;
            case 9: System.out.println("\nEjercico 9.\nPrograma que dibujar un triángulo compuesto por asteriscos según una altura solicitada\n" +
                    "al usuario.");
                    triangAsterisco("*");
                    break;
            case 10: System.out.println("\nEjercico 10.\nPrograma que dibujar un triángulo compuesto por una secuencia de números por cada\n" +
                    "nivel según una altura solicitada al usuario, cada nivel es la secuencia de 1 hasta el número del\n" +
                    "nivel.");
                    triangAsterisco("n");
                    break;
            default: System.out.println("Usted no ha seleccionado un ejercicio valido");
                break;
        }
        
    }
    public static void monkeyTrouble(){
        System.out.println("\nEjercicio 1.\nWe have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.\n" +
            "We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in\n" +
            "trouble.");
        System.out.print("aSmile (true or false): ");
        boolean aSmile=new Scanner(System.in).nextBoolean();
        System.out.print("bSmile (true or false): ");
        boolean bSmile=new Scanner(System.in).nextBoolean();
        if (aSmile==bSmile){
            System.out.println("monkeyTrouble("+aSmile+","+bSmile+") → true");
            }
        else{System.out.println("monkeyTrouble("+aSmile+","+bSmile+") → false");
        }
    }
    public static void sleepIn(){
        System.out.println("\nEjercicio 2.\nThe parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on\n" +
            "vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.");
        System.out.print("Is it a weekday?(true or false) ");
        boolean weekday=new Scanner(System.in).nextBoolean();
        System.out.print("Are we on vacation?(true or false) ");
        boolean vacation=new Scanner(System.in).nextBoolean();
        if ((weekday == vacation)|| weekday!=true ){
            System.out.println("sleepIn("+weekday+","+vacation+") → true");
            }
        else{System.out.println("sleepIn("+weekday+","+vacation+") → false");
        }
    }
    public static void sumDouble(){
        System.out.println("\nEjercicio 3.\nGiven two int values, return their sum. Unless the "
                + "two values are the same, then return double their sum.");
        System.out.print("int value 1: ");
        int n1=new Scanner(System.in).nextInt(); 
        System.out.print("int value 2: ");
        int n2=new Scanner(System.in).nextInt(); 
        if(n1==n2){
           System.out.println("sumDouble("+n1+","+n2+") → "+(n1+n2)*2); 
        }else{
           System.out.println("sumDouble("+n1+","+n2+") → "+(n1+n2));
        }
        
    }
    public static void numero10(){
        System.out.println("\nEjercicio 4.\nGiven 2 ints, a and b, return true if one if them is 10"
                + " or if their sum is 10.");
        System.out.print("int a: ");
        int n1=new Scanner(System.in).nextInt(); 
        System.out.print("int b: ");
        int n2=new Scanner(System.in).nextInt(); 
        if((n1==10 || n2==10)|| n1+n2==10){
           System.out.print("makes10("+n1+","+n2+") → true"); 
        }else{
           System.out.print("makes10("+n1+","+n2+") → false");
        }
        
    }
    
    public static void numeroMax(){
        System.out.println("\nEjercicio 5.\nGiven three int values, a b c, return the largest.");
        System.out.print("int a: ");
        int n1=new Scanner(System.in).nextInt(); 
        System.out.print("int b: ");
        int n2=new Scanner(System.in).nextInt(); 
        System.out.print("int c: ");
        int n3=new Scanner(System.in).nextInt();
        int max;
        if(n1<=n2 && n3<=n2){
            max=n2;
        }else if(n1<=n2 && n2<=n3){
            max=n3;
        }else{
            max=n1;
        }
        System.out.println("intMax("+n1+","+n2+","+n3+")"+" → "+max);   
    }
    public static void serieInitFinal(){
        System.out.println("\nEjercicio 6.\nPrograma que cumple los siguientes requerimientos\n" +
            "a. Le pregunta al usuario un numero inicial y un número final y este imprime los\n" +
            "números incrementando de a uno, iniciando en el numero inicial ingresado por el usuario y\n" +
            "terminando en el número final ingresado por el usuario.");
        System.out.print("Número Inicial: ");
        int n1=new Scanner(System.in).nextInt(); 
        System.out.print("Número Final: ");
        int n2=new Scanner(System.in).nextInt();
        for(int i=n1;i<=n2;i++){
            System.out.print(i);
            if (i<n2){
                System.out.print(",");
            }
        }
        System.out.print("\n");
        
    }
    public static void tresNumeros(){
                    
        System.out.println("\nEjercicio 7.\nPrograma que cumple los siguientes requerimientos:\n" +
            "a. Solicita al usuario que ingrese 3 números\n" +
            "b. Imprime la suma de los 3 números\n" +
            "c. Imprime la resta de los 3 números\n" +
            "d. Imprime la multiplicación de los 3 números\n" +
            "e. Imprime la división de los 3 números.");
        System.out.print("número 1: ");
        double n1=new Scanner(System.in).nextDouble(); 
        System.out.print("número 2: ");
        double n2=new Scanner(System.in).nextDouble(); 
        System.out.print("número 3: ");
        double n3=new Scanner(System.in).nextDouble();
        double suma=n1+n2+n3;
        System.out.println("Suma: "+n1+" + "+n2+" + "+n3+" = "+suma);
        double resta=n1-n2-n3;
        System.out.println("Resta: "+n1+" - "+n2+" - "+n3+" = "+resta);
        double mult=n1*n2*n3;
        System.out.println("Multiplicación: "+n1+" * "+n2+" * "+n3+" = "+mult);
        double div=n1/n2/n3;
        System.out.println("Divición: "+n1+" / "+n2+" / "+n3+" = "+div);
    
    }
    public static void fibonacci(){
        System.out.println("\nEjercicio 8.\nPrograma que imprime la serie de Fibonacci hasta un número indicado por el usuario.");
        System.out.print("Serie de Fibonacci hasta el número (entero): "); 
        int n =new Scanner(System.in).nextInt();
        int f1=0;
        int f2=1;
        
        for (int i=1;i<n;i++){
            if (i==1){
                System.out.print(f1+","+f2);
            }
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(","+f2);
        }
        System.out.print("\n");
    
    }
    public static void triangAsterisco(String type){
        System.out.print("Indique la altura del triangulo (numero entero): ");
        int n=new Scanner(System.in).nextInt(); 
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if("*".equals(type)){
                    //d= j;
                    System.out.print("*");
                            }
                else{
                    System.out.print(j+1);
                            }
                        }
            System.out.print("\n");
            
        }
    }
}
