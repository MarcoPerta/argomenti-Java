// Per creare elenchi mutabili e dinamici, possiamo utilizzare la classe ArrayList di Java. ArrayList consente di:

// memorizzare riferimenti a oggetti come elementi
// memorizzare elementi dello stesso tipo (proprio come gli array)
// Accedere agli elementi per indice (proprio come gli array)
// Aggiungere elementi
// Rimuovere elementi

import java.util.ArrayList;

// Per creare una lista : 
ArrayList<String> babyNames;
ArrayList<Integer> ages;

// Il generico <Integer> deve invece essere usato in un ArrayList.
// Si possono usare anche <Double> e <Character> per i tipi che normalmente si dichiarano come doppi o caratteri.

ArrayList<String> babyNames = new ArrayList<String>();



// import the ArrayList package here:
import java.util.ArrayList;

class ToDos {
  
  public static void main(String[] args) {
    
    // Create toDoList below:
    ArrayList<String> toDoList = new ArrayList<String>();
    
  }
  
}