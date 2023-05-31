javac Compiling.java //scritto da terminale, compiling è il nome del file 

//Il comando "javac Compiling.java" viene utilizzato per compilare un file di codice sorgente Java chiamato "Compiling.java".Il comando "javac" è il compilatore di Java, che traduce il codice sorgente scritto nel linguaggio di programmazione Java in bytecode, che può essere eseguito dalla Java Virtual Machine (JVM).Assumendo che il file "Compiling.java" sia situato nella directory corrente, il comando "javac Compiling.java" creerà un nuovo file nella stessa directory chiamato "Compiling.class", che contiene il bytecode compilato. Se ci sono errori nel codice sorgente, il compilatore stamperà messaggi di errore che indicano la posizione e la natura degli errori.

public class Compiling {
  public static void main(String[] args) {
    //The main method executes the tasks of the class

    System.out.println("Java is a class-based language.");
    System.out.println("Java classes have a 'main' method.");
    System.out.println("Java statements end with a semicolon.");

    System.out.println("Programming is... fun!");
    
  }
}