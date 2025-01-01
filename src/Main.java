//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //sherlock
        ArrayList <String> sherlocksToDos = new ArrayList<>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("Solve the case");
        sherlocksToDos.add("apprehend the crime");

        //poirot
        ArrayList<String> poirotsToDos = new ArrayList<>();
        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");


        //print the size of each array below
        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());

        //print the name of the detective with the larger to-do list

        if (sherlocksToDos.size()<poirotsToDos.size()){
            System.out.println(poirotsToDos);
        }
        else System.out.println(sherlocksToDos);
    }
}