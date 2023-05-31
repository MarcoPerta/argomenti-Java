class Car {
 
  String color;
 
  public Car(String carColor) {
    color = carColor;
  }
 
 //qua abbiamo il metodo
  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }
 
  public static void main(String[] args){
    Car myFastCar = new Car("red");
    // qua chiamo il metodo in un oggetto
    myFastCar.startEngine();
    System.out.println("That was one fast car!");
  }
}

/*Per prima cosa, facciamo riferimento al nostro oggetto myFastCar. Quindi, utilizziamo l'operatore punto (.) per chiamare il metodo startEngine(). Si noti che è necessario includere le parentesi () dopo il nome del metodo per chiamarlo.
Il codice viene generalmente eseguito in un ordine dall'alto verso il basso, in cui l'esecuzione del codice inizia all'inizio del programma e termina alla fine; tuttavia, i metodi vengono ignorati dal compilatore a meno che non vengano chiamati.
Quando un metodo viene chiamato, il compilatore esegue tutte le istruzioni contenute nel metodo. Una volta eseguite tutte le istruzioni del metodo, l'ordine di esecuzione dall'alto verso il basso continua. Questo è il motivo per cui Avvia la macchina! e Vroom! vengono emessi prima di Quella era una macchina veloce!.*/

//void : non ritorna nessun output quindi senza return

public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
	System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.advertise();
    /*l'output sarà 
      Selling Lemonade!
      Come spend some money!*/
  }
}