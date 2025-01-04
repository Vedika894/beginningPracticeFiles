//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String[] words = {"apple", "banana", "cherry", "kiwi"};

       String longestWord = " ";
       for (String i : words){
           if (i.length() > longestWord.length()){
               longestWord = i;
           }
       }
        System.out.println(longestWord);
    }
}