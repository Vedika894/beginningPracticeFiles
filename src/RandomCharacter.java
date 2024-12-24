//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class RandomCharacter {

    //generates a random character between ch1 and ch2
     public static char getRandomCharacter(char ch1, char ch2){
         return (char)(ch1 +Math.random() * (ch1-ch2+1));
     }
     //generates a random lower case character
     public static char getRandomLowerCaseLetter(){
         return getRandomCharacter('a','z');
     }
    //generates a random upper case character
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
      //generates a random digit character
    public static char getRandomDigitCharacter(){
         return getRandomCharacter('0','9');
    }
   //generates a random character
    public static char getRandomCharacter(){
         return getRandomCharacter('\u0000','\uFFFF');
    }

}
//all the methods use the getRandom character method
//all the methods do not have formal parameters, don't need anything
//they all return character values
