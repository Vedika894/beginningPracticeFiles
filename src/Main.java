//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
      Newsfeed sampleFeed = new Newsfeed();

      //printing the first topic
      System.out.println("The topic is" + sampleFeed.getFirstTopics());

      sampleFeed.viewTopics(0);
      sampleFeed.viewTopics(2);
      sampleFeed.viewTopics(0);
      sampleFeed.viewTopics(2);
      sampleFeed.viewTopics(3);
      sampleFeed.viewTopics(3);
      sampleFeed.viewTopics(1);
      sampleFeed.viewTopics(2);
      sampleFeed.viewTopics(1);

      System.out.println("the"+ sampleFeed.topics[1]+ "has been viewed"+ sampleFeed.view[1]+"times");
      //calling the Arrays, using the sampleFeed object we created.

    }
}