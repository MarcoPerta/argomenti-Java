int numCupcakes = 12;

numCupcakes = numCupcakes + 8; // Value is now 20

numCupcakes += 8; // Value is now 20

/*
Addition (+=)
Subtraction (-=)
Multiplication (*=)
Division (/=)
Modulo (%=)
*/


double balance = 20000.01;
double amountToWithdraw = 5000.01;
System.out.print(amountToWithdraw < balance);
//true fin quando rispetta la condizione

double myBalance = 200.05;
double costOfBuyingNewLaptop = 1000.05;
boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;
//false fin quando rispetta la condizione


// METODO EQUALS PER COMPARARE OGGETTI
String person1 = "Paul";
String person2 = "John";
String person3 = "Paul";
 
System.out.println(person1.equals(person2));
// Prints false, since "Paul" is not "John"
System.out.println(person1.equals(person3));
// Prints true, since "Paul" is "Paul"

int balance = 10000;
String message = "Your balance is: " + balance;
System.out.println(message); //This code will print:Your balance is: 10000

final int yearBorn = 1968; // variabile che non si può cambiare perchè c'è final