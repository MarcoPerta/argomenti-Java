// Come un'istruzione if, il codice all'interno di un ciclo while viene eseguito solo se la condizione è vera. 
// Tuttavia, un ciclo while continuerà a eseguire il codice più volte finché la condizione non sarà valutata falsa. 
// Quindi il blocco di codice si ripeterà fino a quando il valore di silliness sarà minore o uguale a 10.

// set attempts to 0
int attempts = 0;
 
// enter loop if condition is true
while (passcode != 0524 && attempts < 4) {
 
  System.out.println("Try again.");
  passcode = getNewPasscode();
  attempts += 1;
 
  // is condition still true?
  // if so, repeat code block
}
// exit when condition is not true

