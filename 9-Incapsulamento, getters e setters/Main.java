/*
 * Incapsulamento
 * 
 * Incapsulamento = processo in cui nascondiamo attributi di una classe all'esterno mettendoli private
 * diventano accessibili solo tramite metodi getters e setters
 * creo classe Persona
 * aggiungo attributi private
 * definisco getters e setters
 */

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Marco", "Perta");
		System.out.println(persona.getNome());
		
		persona.setCognome("Verdi");
		System.out.println(persona.getCognome());
        //print Verdi
	}

}