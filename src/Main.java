//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

       static  class ScaryStory {
            Monster monster;
            String setting;

            public ScaryStory(Monster antagonist, String place) {
                monster = antagonist;
                setting = place;
            }

            public void tellStory(){
                System.out.println("Once upon a time, " + monster.name + " was at " + setting + " looking to scare some mortals.");
            }

            public static void main(String[] args) {
                Monster dracula;
                dracula = new Vampire("Dracula");
                ScaryStory countDracula = new ScaryStory(dracula, "Dracula Castle");
                countDracula.tellStory();
            }
        }

}