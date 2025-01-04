public class Dog extends Animal {

    private int breed;

    public int getBreed(){
        return breed;
    }

    public void setBread(int breed){
        this.breed = breed;
    }


public void eat(){
    System.out.println("much much");
}
    public void eat(int numberOfTimes){
        for (int i =0; i< numberOfTimes; i++ ) {
            System.out.println(" chomp chomp ");
        }
    }










}
