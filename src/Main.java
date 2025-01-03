//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            private int instanceVariable; // Non-static (instance) variable
            private static int staticVariable; // Static variable

            // Static method
            public static void staticMethod() {
                // Cannot access instanceVariable directly
                // System.out.println(instanceVariable); // Error: Non-static field cannot be referenced from a static context

                // Can access staticVariable
                System.out.println("Static Variable: " + staticVariable);
            }

            // Non-static method
            public void instanceMethod() {
                // Can access both instanceVariable and staticVariable
                System.out.println("Instance Variable: " + instanceVariable);
                System.out.println("Static Variable: " + staticVariable);
            }

            public static void main(String[] args) {
                Main.staticMethod(); // Access static method directly using the class name

                Main example = new Main();
                example.instanceVariable = 10; // Set instance variable
                Main.staticVariable = 20; // Set static variable

                example.instanceMethod(); // Access instance method
            }
        }

