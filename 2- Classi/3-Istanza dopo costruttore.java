//Dopo aver definito il costruttore creiamo una nuova istanza in cui possiamo passargli il valore

public class Car {
  String color;
 
  public Car(String carColor) {
    // assign parameter value to instance field
    color = carColor;
  }
 
  public static void main(String[] args) {
    // parameter value supplied when calling constructor
    Car ferrari = new Car("red");
  }
}

// possiamo accedere all'istanza in questo modo : 

/*
accessing a field:
objectName.fieldName
*/
 
ferrari.color;
// "red"


public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    
    Store lemonadeStand = new Store("lemonade");

    System.out.println(lemonadeStand.productType); // per stampare lemonade
  }
}