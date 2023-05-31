Lo Stato ci dice cosa deve sapere un conto di risparmio:
Il saldo del denaro disponibile
Il comportamento ci dice quali compiti un conto di risparmio dovrebbe essere in grado di svolgere:
depositare - aumentare l'importo disponibile
Prelevare - diminuire l'importo disponibile
Controllare il saldo - visualizzare l'importo disponibile.
I metodi sono blocchi di codice modulari e ripetibili, utilizzati per svolgere compiti specifici. Abbiamo la possibilità di definire i nostri metodi che accettano un input, fanno qualcosa con esso e restituiscono il tipo di output che desideriamo.
Guardando l'esempio precedente, ricreare un conto di risparmio non è un compito facile. Come può un programma affrontare un problema così grande? 
È qui che tornano utili i metodi, con la loro capacità di svolgere compiti più piccoli e specifici. Attraverso la decomposizione dei metodi, possiamo usare i metodi per scomporre un problema di grandi dimensioni in problemi più piccoli e gestibili.


public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}