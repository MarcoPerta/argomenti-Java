// ArrayList dispone di un metodo add() che inserisce un elemento nella struttura. 
// Ci sono due modi per usare add().

ArrayList<Car> carShow = new ArrayList<Car>();
 
carShow.add(ferrari);
// carShow now holds [ferrari]

// Se vogliamo aggiungere un elemento a un indice specifico della nostra ArrayList, avremo bisogno di due argomenti nella nostra chiamata al metodo: 
// il primo argomento definirà l'indice del nuovo elemento, mentre il secondo argomento definirà il valore del nuovo elemento:
// Insert object corvette at index 1
carShow.add(1, corvette);
// carShow now holds [ferrari, corvette, thunderbird, volkswagen

// Quando si utilizzano metodi di ArrayList (come add()), i parametri di riferimento e il tipo di ritorno di un metodo devono corrispondere al tipo di elemento dichiarato dell'ArrayList. Ad esempio, non è possibile aggiungere un valore di tipo Integer a un ArrayList di elementi String.
// Nello snippet seguente, un ArrayList che può memorizzare valori diversi, perché non ne viene specificato il tipo durante l'inizializzazione.
ArrayList assortment = new ArrayList<>();
assortment.add("Hello"); // String
assortment.add(12); // Integer
assortment.add(ferrari); // reference to Car
// assortment holds ["Hello", 12, ferrari]


import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "Do Shower";
    
    // Add to-dos to toDoList
    String toDo3 = "Clean bath";

    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);

    System.out.println(toDoList);  
    
  }
  
}
