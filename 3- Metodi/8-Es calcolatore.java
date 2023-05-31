public class Calculator{

  public Calculator(){

  }

//metodo per la somma 
  public int add(int a , int b){

    int sum = a + b; 
    return sum;
  }

//metodo per la divisione 
  public int subtract(int a , int b){
    
    int sub = a - b; 
    return sub;
  }

//metodo per la moltiplicazione 
  public int multiply(int a , int b){
    
    int multi = a * b; 
    return multi;
  }

//metodo per la divisione 
  public int divide(int a , int b){

    int div = a / b; 
    return div;
  }

//metodo per ottenere il modulo  
  public int modulo(int a , int b){

    int mod = a % b; 
    return mod;
  }


  public static void main(String[] args){

    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5,7));

    System.out.println(myCalculator.subtract(45,11));
  }
}