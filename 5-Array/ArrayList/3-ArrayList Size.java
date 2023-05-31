import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");

    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    
    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());
    //con arraylist.size() vediamo quanto è lungo un determinato array 


    // Print the name of the detective with the larger to-do list:
    if (sherlocksToDos.size() > poirotsToDos.size()){
      System.out.println("Sherlock");
    }else{
      System.out.println("Poirot");
    }
  }
  
}