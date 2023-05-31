
/*
 * Polimorfismo : capacità di un oggetto di collegarsi con più tipi di dato
 */

public class Main {

	public static void main(String[] args) {
		
		Studente studente1 = new Studente("Luca", "Rossi");
		Insegnante insegnante1 = new Insegnante("Marco", "Rossi");
		
		//questo è il polimorfismo, la classe persona può tenere entrambi i tipi di oggetti perchè 
		// sono una sua estensione
		Persona[] classe = {studente1, insegnante1};
		
		for(Persona persona : classe) {
			persona.saluta();
		}
		

	}

}