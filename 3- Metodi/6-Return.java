/*Ricordiamo che le variabili possono esistere solo nell'ambito in cui sono state dichiarate. Possiamo utilizzare un valore al di fuori del metodo in cui è stato creato se lo restituiamo dal metodo.
Per restituire un valore si usa la parola chiave return:*/
public int numberOfTires() {
   int tires = 4;
   // return statement
   return tires;
}
//qui difinaco a public mettiamo int perchè ritorno un int

public static void main(String[] args){
    Car myCar = new Car("red");
    int numTires = myCar.numberOfTires();
}
/*In main(), abbiamo chiamato il metodo numberOfTires() su myCar. Poiché il metodo restituisce un valore int di 4, memorizziamo il valore in una variabile intera chiamata numTires. Se stampassimo numTires, vedremmo 4.*/

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
     double totalPrice = price + price * 0.08;
     return totalPrice;
   }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);

  }
}