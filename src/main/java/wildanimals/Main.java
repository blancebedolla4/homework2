package wildanimals;

public class Main {
    public static void main(String[] args) {
        Animal elephantidae = new Animal();
        Animal cetacea = new Animal();
        Animal rhinocerotidae = new Animal();

        elephantidae.name = "elephant";
        elephantidae.isEndangered = true;
        elephantidae.leftInTheWild = new int[]{40000,150000,120000,500};
        elephantidae.animalSound = "trumpet";

        elephantidae.printAnimalSound();
        elephantidae.printleftInTheWild();

        cetacea.name = "whales";
        cetacea.isEndangered = true;
        cetacea.leftInTheWild= new int[]{30000,25000,15000};
        cetacea.animalSound = "phwargh";

        cetacea.printAnimalSound();
        cetacea.printleftInTheWild();



        rhinocerotidae.name ="rhinocerous";
        rhinocerotidae.isEndangered=false;
        rhinocerotidae.leftInTheWild= new int[]{45000,1234567,890987};
        rhinocerotidae.animalSound="trumpet";

        rhinocerotidae.printAnimalSound();
        rhinocerotidae.printleftInTheWild();




    }
}
