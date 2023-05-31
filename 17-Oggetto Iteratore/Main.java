import java.util.ArrayList;
import java.util.Iterator;

/*
 * Un Iteratore è un oggetto che cicla una collezzione(in questo caso AarrayList)
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> persone = new ArrayList<String>();
		
		persone.add("Luca");
		persone.add("Paolo");
		persone.add("Maria");
		persone.add("Elena");
		
		Iterator<String> it = persone.iterator();
		
		while(it.hasNext()) { //se l'oggetto iteratore ha qualcosa dentro
			String persona = it.next();
			if(persona == "Anna") {
				it.remove();
			}
			}
		System.out.println(persone);

	}

}