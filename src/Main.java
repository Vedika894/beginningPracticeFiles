//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "camel", "cow", "deer"};
        int count = 0;

        for (String i : animals) {
            if (i.charAt(0) == 'c') {
                count++;
            }

        }
        System.out.println(count);
    }
}
