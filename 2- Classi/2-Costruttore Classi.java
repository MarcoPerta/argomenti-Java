public class Store {
  
  // new method: constructor!
  public Store() {
     System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
    
  }
}

/*All'interno di main(), stampate lemonadeStand per vedere come Java rappresenta questa istanza.
Esaminate l'ordine dei messaggi stampati:

L'esecuzione del programma richiama main()
Creiamo un'istanza, quindi passiamo da main() a Store()
Il codice all'interno di Store() viene eseguito
Quando Store() termina l'esecuzione, si ritorna a main()*/

//DEFINIRE VARIABILI E RICHIAMARLI NEL COSTRUTTORE 
public class Car {
  String color;
  // constructor method with a parameter
  public Car(String carColor) {  
    // parameter value assigned to the field
    color = carColor;
  }
  public static void main(String[] args) {
    // program tasks
  }
}

//possiamo usare più costruttori e giocare con le variabili 
public class Car {
  String color;
  int mpg;
  boolean isElectric;
 
  // constructor 1
  public Car(String carColor, int milesPerGallon) {
    color = carColor;
    mpg = milesPerGallon;
  }
  // constructor 2
  public Car(boolean electricCar, int milesPerGallon) {
    isElectric = electricCar;
    mpg = milesPerGallon;
  }
}
