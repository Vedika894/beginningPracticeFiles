//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args){

      for (int i =1; i <=50; i++){
          if(i%3 ==0){
              continue;
          }
          System.out.println(i);
          if (i>=40){
              break;
          }

      }
    }
}