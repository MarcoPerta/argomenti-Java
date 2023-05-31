/*Un metodo è un compito che un oggetto di una classe esegue.
Il dominio di questo compito è delimitato da parentesi graffe: {, e }. Tutto ciò che si trova all'interno delle parentesi graffe fa parte dello scope. Questo dominio è chiamato scope di un metodo.
Non è possibile accedere alle variabili dichiarate all'interno di un metodo nel codice che si trova al di fuori dello scope del metodo stesso.*/

class Car {
  String color;
  int milesDriven;
 
  public Car(String carColor) {
    color = carColor;
    milesDriven = 0;         
  }
 
  public void drive() {
     String message = "Miles driven: " + milesDriven;
     System.out.println(message);
  }
 
  public static void main(String[] args){
     Car myFastCar = new Car("red");
     myFastCar.drive();
  }
}


public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType  + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store cookieShop = new Store(cookie);

    cookieShop.advertise();
    //l'output sarà Selling Cookies!
  }
}