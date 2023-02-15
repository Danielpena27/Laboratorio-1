
package javaapplication1;


public class calculadora_clase {
    
   public double num1;
   public double num2;
   public double result;
   public double angulo;
   public String op;
    
  public calculadora_clase(double num1, double num2, double angulo) {
 
  this.num1=num1;
  this.num2=num2;
  this.angulo=angulo;
 }
  public calculadora_clase(){
  
  num1=0;
  num2=0;
  result=0;
  angulo=0;
  op="0";
  
  }
  
  
  public Double sum(double x, double y) {
        
      
      return x+y; 
}
  public Double rest(double x, double y) {
        
      
      return x-y; 
}
  public Double mul(double x, double y) {
        
      
      return x*y; 
}
  public Double div(double x, double y) {
        
      
      return x/y; 
}
  public Double pot(double x, double y){
        
      return Math.pow(x, y)  ;
  } 
  public Double raiz(double x){
        
      return Math.sqrt(x);
       
  } 
  public Double seno(double z){
        
      return Math.sin(z);
      
  } 
  public Double cos(double z){
        
      return Math.cos(z);
      
  } 
  public Double tan(double z){
        
      return Math.tan(z);
      
  } 
  public Double porcen(double x, double y){
        
      return (x* (y/100));
  }
  public Double aseno(double z){
        
      return Math.asin(z);
      
  } 
  public Double acos(double z){
        
      return Math.acos(z);
      
  }
  public Double atan(double z){
        
      return Math.atan(z);
      
  }
  public Double senoh(double z){
        
      return Math.sinh(z);
      
  }
  public Double cosh(double z){
        
      return Math.cosh(z);
      
  }
  public Double tanh(double z){
        
      return Math.tanh(z);
      
  }
  public Double exp(double x){
        
      return Math.exp(x);
       
  }
  public Double log(double x){
        
      return Math.log(x);
       
  }
 
  
}