double[] prices = {13.1, 15.87, 14.22, 16.66};
 
System.out.println(prices[1]);


import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public String getTopTopic(){
    return topics[0];
  }
  
  public void viewTopic(int topicIndex){
    // porta variabile che fa da segno per quale elemento dell'array prendere
     views[topicIndex] = views[topicIndex] + 1;
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }
}