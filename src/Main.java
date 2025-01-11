//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a word");
            String word = scanner.nextLine();

            System.out.print("""
                    Please chose the case you want to convert to : 
                    1. l or L for LowerCase
                    2. u or U for upperCase
                    3. t or T for titleCase
                    """);

        char caseType = scanner.nextLine().charAt(0);

            System.out.printf("%-38s : %s%n","Original word", word);
            System.out.printf("%-38s : %s%n", "Calling the firstConvertCase method", convertCase(word));
            System.out.printf("%-38s : %s%n", "Calling the SecondConvertCase method", convertCase(word, caseType));

        }
        public static String toTitleCase(String str){
            //First character is upperCase and the rest of the word is lower case
            return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        }

        public static String convertCase(String word){
            return toTitleCase(word);
        }
        public static String convertCase(String word, char CaseType){
            return switch (Character.toLowerCase(CaseType)){     //upper or lower case version of the letter return the same result
                case 'l' -> word.toLowerCase();
                case 'u' -> word.toUpperCase();
                case 't' -> toTitleCase(word);
                default -> " ";
            };
        }

    }
































//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input a word: ");
//        String word = input.nextLine();
//        System.out.println("PLease choose the case you want to convert:" +
//                "1. 'l'or 'L for lower case" +
//                "2. 'u' or 'U' for uppercase" +
//                "3. 't' or 'T for titleCase'"
//        );
//
//        char caseType = input.nextLine().charAt(0);
//
//        System.out.printf("Original word: " + word);
//        System.out.printf(" \nCalling the first convertCase method: " + convertCase(word));
//        System.out.printf("  \nCalling the second convertCase method: " + convertCase(word, 'u'));
//    }
//
//    public static String convertCase(String word) {
//       return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
//    }
//
//    public static String convertCase(String word, char caseType){
//       String result = "";
//       switch (caseType){
//            case 'u':
//            result = word.toUpperCase();
//            case 'U':
//                result = word.toUpperCase();
//                break;
//            case 'L' :
//                result = word.toLowerCase();
//                break;
//            case 'l':
//                result = word.toLowerCase();
//                break;
//            case 't':
//                result = convertCase(word);
//                break;
//            case 'T' :
//                result = convertCase(word);
//            break;
//        };
//       return result;
//    }
//}