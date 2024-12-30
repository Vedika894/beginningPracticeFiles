//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Newsfeed sampleFeed = new Newsfeed();

        System.out.println("The topic is" + sampleFeed.getFirstTopic());

        sampleFeed.viewTopics(1);
        sampleFeed.viewTopics(1);
        sampleFeed.viewTopics(3);
        sampleFeed.viewTopics(2);
        sampleFeed.viewTopics(2);
        sampleFeed.viewTopics(1);

        System.out.println("The" + sampleFeed.topics[1]+"topics has been viewed"+
                sampleFeed.views[1]+ "times");


    }
}