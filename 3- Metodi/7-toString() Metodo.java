/*Quando definiamo un toString metodo possiamo ritornare una stringa che stampa quello che abbiamo nell'oggetto*/

class Car {
 
    String color;
 
    public Car(String carColor) {
        color = carColor;
    }
 
    public static void main(String[] args){
        Car myCar = new Car("red");
        System.out.println(myCar);
    }
 
   public String toString(){
       return "This is a " + color + " car!";
   }
}
/*Quando viene eseguito, il comando System.out.println(myCar) stamperà This is a red car!, che ci informa sull'oggetto myCar.*/

public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);

    System.out.println(lemonadeStand);
    System.out.println(cookieShop);

  }

   /*invochiamo il metodo to string per stampare le stringhe con le variabili istanziate nel main cell'oggetto
   Store così stamperà : 
   This store sells Lemonade at a price of 3.75.
   This store sells Cookies at a price of 5.0.*/
  public String toString(){
    return "This store sells " + productType + " at a price of " + price  + ".";
  }

}