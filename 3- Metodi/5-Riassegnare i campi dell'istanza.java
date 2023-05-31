//I seguente codice : 

public class SavingsAccount{
  double balance;
  public SavingsAccount(double startingBalance){
    balance = startingBalance;
  }
 
  public void deposit(double amountToDeposit){
     //Add amountToDeposit to the balance
  }
 
  public void withdraw(double amountToWithdraw){
     //Subtract amountToWithdraw from the balance
  }
 
  public static void main(String[] args){
 
  }
}

// Possiamo riassegnare il valore di balance :  
public void deposit(double amountToDeposit){
  double updatedBalance = balance + amountToDeposit;
  balance = updatedBalance;
}

// E ora richiamo il metodo deposit() con il valore di balance cambiato 
public static void main(String[] args){
  SavingsAccount myAccount = new SavingsAccount(2000);
  System.out.println(myAccount.balance);
  myAccount.deposit(100);
  System.out.println(myAccount.balance);
}

/*Questo codice stampa prima 2000, il valore iniziale di myAccount.balance, e poi stampa 2100, che è il valore di myAccount.balance dopo l'esecuzione del metodo deposit().*/

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
    //imposto la somma per fare il nuovo prezzo aumentato
    double newPrice = price + priceToAdd;
    //cambio il valore della variabile price col nuovo prezzo
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    //aumento il prezzo richimando l'apposito metodo 
    lemonadeStand.increasePrice(1.5);
    //richiamo la variabile prezzo cambiata
    System.out.println(lemonadeStand.price);
  }
}