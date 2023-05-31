
/*
 * Casting dei valori
 * Implicito : automatico quando passiamo ad un tipo più ampio (int -> double, float-<double)
 * Esplicito : manuale quando passiamo ad un tipo più ristretto
 */

public class Main {

	public static void main(String[] args) {
		
	//in questo caso me lo trasformerà automaticamente in un int	
	double x = 9;
	System.out.println(x);
	
	//nel casting implicito, io specifico int anche se è un double, per dirlo a java scrivo int 
	//nella parentesi, cioè faccio il cast e mi darà 9 e non 9.5 che è un double
	int y = (int) 9.5;
	System.out.print(y);
	
	
}
}