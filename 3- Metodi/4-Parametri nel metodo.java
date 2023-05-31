/*Abbiamo visto come uno scope ci impedisca di utilizzare le variabili dichiarate in un metodo in un altro metodo. E se in un metodo avessimo delle informazioni da passare a un altro metodo?
Analogamente a come abbiamo aggiunto i parametri ai costruttori, possiamo personalizzare tutti gli altri metodi in modo che accettino parametri. Ad esempio, nel codice seguente, creiamo un metodo startRadio() che accetta un parametro Double, stationNum, e un parametro String chiamato stationName:*/

class Car {
 
  String color;
 
  public Car(String carColor) {
    color = carColor;         
  }
 
  public void startRadio(double stationNum, String stationName) {
    System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
    System.out.println("Enjoy!");
  }
 
  public static void main(String[] args){
    Car myCar = new Car("red");
    myCar.startRadio(103.7, "Meditation Station");
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
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }

  public void greetCustomer(String customer){
    System.out.println("Welcome to the store, " + customer + "!");
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.greetCustomer("Marco");
    lemonadeStand.advertise();
    /*'utput sarà:
       Welcome to the store, Marco!
       Selling Lemonade! */
    }
}