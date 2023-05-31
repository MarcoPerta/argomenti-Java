public class Persona {

	private String nome;
	private String cognome;
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	
	//per copiare con il costruttore invece,chiamo nuovo oggetto Persona e gli passo persona1, e 
	//chiamo il metodo copy
	Persona(Persona persona){
		this.copy(persona);
	}
	
	
	//l'unico modo in cui possiamo accedere a nome
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//copio oggetto con metodo, passo nelle parentesi l'oggetto persona1 e dico a 
	// persona 2 setta il nome con il get di persona1
	public void copy(Persona persona) {
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());
	}
	
	
}