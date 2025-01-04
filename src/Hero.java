public class Hero extends Person{

String superPower;

Hero(String name, int age, String power){
    super(age, name);
    this.superPower = power;
}
    public String toString(){
        return super.toString() + this.superPower;

    }






}
