//quanto devo pagare al mese ? 

public class CarLoan {
	public static void main(String[] args) {
   int carLoan = 10000;
   //represent a loan length of 3 years
   int loanLength = 3;
   //represent an interest rate of 5% on the loan.
   int interestRate = 5;
   //represent the down payment provided by a user for this car purchase.
   int downPayment = 2000;
	
  if(loanLength <= 0 && interestRate <= 0){
    System.out.println("non puoi sottoscrivere il prestito.");
	 }else if(downPayment >= carLoan){
    System.out.println("Puoi pagare interamente l'auto.'");
   }else{
    int remainingBalance = carLoan - downPayment;
    int months = loanLength * 12;
    // represents the monthly payment without interest included.
    int monthlyBalance = remainingBalance  / months; 
    int interest = (monthlyBalance * interestRate) / 100;
    int monthlyPayment = monthlyBalance + interest;

    System.out.println(monthlyPayment);
   };
}
}