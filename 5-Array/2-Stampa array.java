// Se vogliamo avere una stampa più descrittiva dell'array stesso, abbiamo bisogno del metodo toString(), fornito dal pacchetto Arrays di Java.
import java.util.Arrays;

// Il pacchetto Arrays ha molti metodi utili, tra cui Arrays.toString(). Quando si passa un array in Arrays.toString(), si può vedere il contenuto dell'array stampato:



import java.util.Arrays;

public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
    
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
  

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    System.out.println(Arrays.toString(topics));
  }
}