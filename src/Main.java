//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*
       method overriding = Declaring a method in a subclass
       which is already present in the parent class.
       done so that the child class can give its own implementation
        */
        Dog dog = new Dog();
        dog.speak();

      Animals animal = new Animals();

      animal.speak();
    }
}