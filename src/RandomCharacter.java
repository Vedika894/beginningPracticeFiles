//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class RandomCharacter {
     public static char getRandomCharacter(char ch1, char ch2){
         return (char)(ch1 +Math.random() * (ch1-ch2+1));
     }





}