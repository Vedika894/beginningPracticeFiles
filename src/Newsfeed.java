public class Newsfeed {
     String[]topics = {"Opinion", "Tech", "Science", "Health"};
     int[]view = {0,0,0,0};

     public Newsfeed(){

     }

     //method
    public String[] getTopics(){
         return topics;   //returns the list of topics
    }
    public String getFirstTopics(){
         return topics[0];
    }
    public void viewTopics(int topicIndex){
         view[topicIndex]++;  //increment the view count for a topic by index
    }
}
