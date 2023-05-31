// Dichiarare array:
 double[] prices;
 double[] prices = {13.15, 15.87, 14.22, 16.66};
 String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};



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
    System.out.println(topics);
  }
}
