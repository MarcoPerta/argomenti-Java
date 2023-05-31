
/*
 * Interfacce sono simili a classe astratte, senza body, la differenza è che 
 * una classe estende solo un altra classe mentre l'interfaccia può estendere più classi che hanno in 
 * condivisione un qualcosa
 */

public class Main {

	public static void main(String[] args) {
		
		Leone leone = new Leone();
		Gazzella gazzella = new Gazzella();
		Pesce pesce = new Pesce();
		
		gazzella.scappa();
		leone.caccia();
		pesce.caccia();
		pesce.scappa();

	}

}