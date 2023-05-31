String[] menuItems = new String[5];
menuItems[0] = "Veggie hot dog";
menuItems[1] = "Potato salad";
menuItems[2] = "Cornbread";
menuItems[3] = "Roasted broccoli";
menuItems[4] = "Coffee ice cream";
//oppure 
String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};


//codice per aggiungere elementi ad un array dopo averlo creatp
import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;
  
  public Newsfeed(){
    
    favoriteArticles = new String[10];
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
    favoriteArticles[favoriteIndex] = newArticle;
    
  }
    
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");
    
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    
  }
}