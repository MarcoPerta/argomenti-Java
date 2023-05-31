
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * Lavorare con i file
 * 
 * verificare se il file esiste nel progetto  nel commputer
 * getPath, getrAbsolutePath, isFile
 * eliminare ifile
 * scrivere in un file con filewriter: write e append
 * leggere un file con filereader
 */
/*
posso creare file da ecplise nel pacchetto adibito, oppure sul desktop, nel primo caso nell'oggetto metto il nome del file, nel secodno caso metto il percorso del file 
per il fileWriter e per il fileReader c'è bisogno del try and catch
*/

public class Main {

	public static void main(String[] args) {
		
		
		File file = new File("prova.txt");
		
		if(file.exists()) {
			System.out.println("il file esiste");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			//file.delete();
		}else {
			System.out.println("il file non esiste");
		}

		//con il fileWriter scrivo all'interno del file
		try {
			FileWriter writer = new FileWriter("prova.txt");
			writer.write("Ciao Sono Marco \n sto facendo il corso di Java");
			writer.append("\n bel file");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//con il reader leggo all'interno del file
		try {
			FileReader reader = new FileReader("prova.txt");
			int data = reader.read();
			
            //il .read legge le stringhe come valori numerici, perciò prendiamo tutti  ivalori numerici cioè diversi da -1
            // e andiamo a leggerli convertendoli in stringhe con (char)
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		

}