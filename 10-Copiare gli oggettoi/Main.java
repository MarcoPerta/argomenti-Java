/*
 * Copiare oggetti tramite metodo e/o costruttore
 */

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Marco","Perta");
		Persona persona2 = new Persona("Luca","Rossi");
		//con il costruttore passo l'oggetto da copiare
		Persona persona2 = new Persona(persona1);
		
		persona2.copy(persona1);
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println();
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
		System.out.println();
		System.out.println(persona2.getNome());
		System.out.println(persona2.getCognome());
		

	}

}