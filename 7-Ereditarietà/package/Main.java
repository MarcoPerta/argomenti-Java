//Ereditarietà : permette ad una o più classi di derivare da un altra ereditando metodi e attributi

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Marco", "Perta");
		persona1.saluta();
		
		Studente studente1 = new Studente("Luca", "Rossi", "Storia");
		studente1.saluta();
		
		Insegnante insegnante1 = new Insegnante("Luca", "Rossi", "Italiano");
		insegnante1.saluta();

	}

}
