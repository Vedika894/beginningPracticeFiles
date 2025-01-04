//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           /*
           super = keyword refers to the superclass (parent) of
           of an object it is very similar to the this keyword
            */
        Hero hero1 = new Hero("Batman", 42, "$$$$$");
        Hero hero2 = new Hero("Superman", 43, "everything");


        System.out.println(hero1.name);
        System.out.println(hero1.superPower);
        System.out.println(hero1.age);

        System.out.println(hero2.toString());



    }
}