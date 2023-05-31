public class Insegnante extends Persona{

	String materia;
	String[] classi = {"1D","2D","3D"};
	
	Insegnante(String nome, String cognome, String materia) {
		super(nome, cognome);
		this.materia = materia;
	}
	
	void insegna() {
		System.out.println("Sto insegnando!");
	}
	
	@Override
	void saluta() {
		System.out.println("Buongiorno studenti");
	}

}