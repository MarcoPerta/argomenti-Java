
//extend significa che studente deriva da Persona
public class Studente extends Persona{
	
	String materiaPreferita;

	Studente(String nome, String cognome, String materiaPreferita) {
		//super chiama la classe da cui deriva (Persona) con i parametri in parentesi
		super(nome, cognome);
		this.materiaPreferita = materiaPreferita;
	}
	
	void studia() {
		System.out.println("Sto studiando!");
	}
	
	
	//Override bypassa il metodo saluta che Studente sta ereditando da Persona e lo sovrascrive
	@Override
	void saluta() {
		System.out.println("Buongiorno prof");
	}
}
