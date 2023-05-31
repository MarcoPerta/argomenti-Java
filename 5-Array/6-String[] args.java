// Il parametro args è un altro esempio di array String. In questo caso, l'array args contiene gli argomenti che vengono passati dal terminale quando si esegue il file di classe. (Finora, args è stato vuoto).

// Come si possono passare argomenti a main()? Supponiamo di avere questa classe HelloYou:

public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello " + args[0]);  
  }
}

// When we run the file HelloYou in the terminal with an argument of "Laura":
java HelloYou Laura
// We get the output:
Hello Laura

// The String[] args would be interpreted as an array with one element, "Laura".

// When we use args[0] in the main method, we can access that element like we did in HelloYou.


import java.util.Arrays;

public class Newsfeed {
  
  String[] topics;
  
  public Newsfeed(String[] initialTopics) {
		topics = initialTopics;
  }
  
  public static void main(String[] args) {
		Newsfeed feed;
    if (args[0].equals("Human")) {
      
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Newsfeed(humanTopics);
      
    } else if(args[0].equals("Robot")) {
      
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed(robotTopics);
      
    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}

// Se nel terminale scrivi : java Newsfeed Human uscirà array per Human al contrario per Robot