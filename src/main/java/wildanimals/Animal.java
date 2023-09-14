package wildanimals;

public class Animal {
    public String name;
    public boolean isEndangered;
    public int[] leftInTheWild;

    public String animalSound;

    public void printAnimalSound(){
        System.out.println(animalSound);


    }
public void printleftInTheWild(){
        for (int i = 0; i <leftInTheWild.length; i++){
            System.out.println(leftInTheWild[i]);
        }
}


}
