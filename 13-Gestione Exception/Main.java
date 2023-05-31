import java.util.Scanner;
import java.util.InputMismatchException;

// le Exception sono errori che interrompono il flusso del programma, con try e catch risolviamo i casi che si presentano con un messaggio o altro

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		System.out.println("inserisci un numero");
		int x = scanner.nextInt();
		
		System.out.println("inserisci un secondo numero");
		int y = scanner.nextInt();
		
		int result = x/y;
		System.out.println("Risultao: " + result);
        //se dividi un numero per zero esce l'errore nella parentesi
	     } catch(ArithmeticException e) {
		    System.out.println("Non puoi dividere per zero");
	     }catch(InputMismatchException e) {
	    	System.out.println("Non puoi dividere il numero per una stringa"); 
	     }finally {
            // dopo la gestione degli errori chiudiamo programma 
	    	 scanner.close();
	     }
		
         }
	}