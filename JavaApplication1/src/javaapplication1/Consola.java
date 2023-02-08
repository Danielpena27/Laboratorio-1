package javaapplication1;

import java.util.Scanner;



public class Consola {
    
    public static void main(String args[]){
    
    Scanner leer = new Scanner (System.in);
    
    int op=0;
    float num1=0;
    float num2=0;
    float result=0;
    float angulo=0;
    
    do{
    
    System.out.println("\n");
    System.out.println("Seleccione la opcion que desea realizar: ");
    System.out.println("1. Suma");
    System.out.println("2. resta");
    System.out.println("3. multiplicacion");
    System.out.println("4. division");
    System.out.println("5. seno");
    System.out.println("6. coseno");
    System.out.println("7. tangente");
    System.out.println("8. raiz");
    System.out.println("9. potencia");
    System.out.println("10. porcentaje");
    System.out.println("11. Salir");
    
    op= leer.nextInt();
    
    if(op != 11 && op != 5 && op != 6 && op != 7 && op!=8){
    
    System.out.println("Digite el primer numero: ");
    num1= leer.nextFloat();
    System.out.println("Digite el segundo numero: ");
    num2= leer.nextFloat();
    
    }
    if(op==5 || op==6 || op==7){
    
    
    System.out.println("Digite el angulo: ");
    angulo= leer.nextFloat();
    
    }
    if(op==8){
    
    System.out.println("Digite el numero: ");
    num1= leer.nextFloat();
    
    }
     
    
    switch(op){
    
        case 1: 
            op=1;
            result= num1+num2;
            System.out.println("El resultado es: " + result);
            break;
        case 2: 
            op=2;
            result= num1-num2;
            System.out.println("El resultado es: " + result);
            break;
        case 3: 
            op=3;
            result= num1*num2;
            System.out.println("El resultado es: " + result);
            break;
        case 4: 
            op=4;
            result= num1/num2;
            System.out.println("El resultado es: " + result);
            break;
        case 5: 
            op=5;
            result= (float) Math.sin(angulo);
            System.out.println("El resultado es: " + result);
            break;
        case 6: 
            op=6;
            result= (float) Math.cos(angulo);
            System.out.println("El resultado es: " + result);
            break;
        case 7: 
            op=7;
            result= (float) Math.tan(angulo);
            System.out.println("El resultado es: " + result);
            break;
        case 8: 
            op=8;
            result= (float) Math.sqrt(num1);
            System.out.println("El resultado es: " + result);
            break;
         case 9: 
            op=9;
            result= (float) Math.pow(num1, num2);
            System.out.println("El resultado es: " + result);
            break; 
         case 10: 
            op=10;
            result= num1* (num2/100);
            System.out.println("El resultado es: " + result);
            break;
    
    }
        
        
        
    
    }while(op !=11);
    
    System.out.println("Muchas gracias, hasta la proxima ");
  }
    
}
