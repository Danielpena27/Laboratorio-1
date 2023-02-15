package javaapplication1;

import java.util.Scanner;



public class Consola {
    
    public static void main(String args[]){
    
    Scanner leer = new Scanner (System.in);
    calculadora_clase opera=new calculadora_clase();
    int op=0;
    double num1=0;
    double num2=0;
    double result=0;
    double angulo=0;
    
    
    
    
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
    System.out.println("11. logaritmo");
    System.out.println("12. exponencial");
    System.out.println("13. aseno");
    System.out.println("14  acoseno");
    System.out.println("15. atangente");
    System.out.println("16. senoh");
    System.out.println("17. cosenoh");
    System.out.println("18. tanh");
    System.out.println("19. Salir");
    
    op= leer.nextInt();
    
    if(op != 11 && op != 5 && op != 6 && op != 7 && op!=8 && op!=12 && op!=13&& op!=14 && op!=15 && op!=16 && op!=17 && op!=18 && op!=19){
    
    System.out.println("Digite el primer numero: ");
    num1= leer.nextFloat();
    System.out.println("Digite el segundo numero: ");
    num2= leer.nextFloat();
    
    }
    if(op==5 || op==6 || op==7 || op==13 || op==14 || op==15 || op==16 || op==17 || op==18){
    
    
    System.out.println("Digite el angulo: ");
    angulo= leer.nextFloat();
    
    }
    if(op==8 || op==11 || op==12){
    
    System.out.println("Digite el numero: ");
    num1= leer.nextFloat();
    
    }
     
    
    switch(op){
    
        case 1: 
            op=1;
            
            System.out.println("El resultado es: " +opera.sum(num1,num2));
            break;
        case 2: 
            op=2;
            
            System.out.println("El resultado es: " +opera.rest(num1,num2));
            break;
        case 3: 
            op=3;
            
            System.out.println("El resultado es: " +opera.mul(num1,num2));
            break;
        case 4: 
            op=4;
            
            System.out.println("El resultado es: " +opera.div(num1,num2));
            break;
        case 5: 
            op=5;
            
            System.out.println("El resultado es: " +opera.seno(angulo));
            break;
        case 6: 
            op=6;
           
            System.out.println("El resultado es: " +opera.cos(angulo));
            break;
        case 7: 
            op=7;
            
            System.out.println("El resultado es: " +opera.tan(angulo));
            break;
        case 8: 
            op=8;
            
            System.out.println("El resultado es: " +opera.raiz(num1));
            break;
         case 9: 
            op=9;
            
            System.out.println("El resultado es: " +opera.pot(num1,num2));
            break; 
         case 10: 
            op=10;
            
            System.out.println("El resultado es: " +opera.porcen(num1,num2));
            break;
         case 11: 
            op=11;
            
            System.out.println("El resultado es: " +opera.log(num1));
            break;
         case 12: 
            op=12;
            
            System.out.println("El resultado es: " +opera.exp(num1));
            break;
         case 13: 
            op=13;
            
            System.out.println("El resultado es: " +opera.aseno(angulo));
            break;
         case 14: 
            op=14;
            
            System.out.println("El resultado es: " +opera.acos(angulo));
            break;
         case 15: 
            op=15;
            
            System.out.println("El resultado es: " +opera.atan(angulo));
            break;
         case 16: 
            op=16;
            
            System.out.println("El resultado es: " +opera.senoh(angulo));
            break;
         case 17: 
            op=17;
            
            System.out.println("El resultado es: " +opera.cosh(angulo));
            break;
         case 18: 
            op=18;
            
            System.out.println("El resultado es: " +opera.tanh(angulo));
            break;
    }
        
        
        
    
    }while(op !=19);
    
    System.out.println("Muchas gracias, hasta la proxima ");
  }
    
    
   
}
