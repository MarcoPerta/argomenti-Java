
/*
 * Gli HashMap sono simili agli oggetti in javascript, e permettono di salvare come chiave valore,
 * il put aggiunge valori, remove toglie, e clean elimina tutto il contenuto.
 */

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> capitali = new HashMap<String, String>();
		
		capitali.put("Italia", "Roma");
		capitali.put("Francia", "Parigi");
		capitali.put("Germania", "Berlino");
		
		capitali.remove("Francia");
		
		System.out.println(capitali);

	}

}