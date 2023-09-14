package wildanimals;

public class Main {
    public static void main(String[] args) {
        Animal elephantidae = new Animal();
        Animal cetacea = new Animal();
        Animal rhinocerotidae = new Animal();

        elephantidae.name = "elephant";
        elephantidae.isEndangered = true;
        elephantidae.leftInTheWild = new int[]{415000,40000,50000};
        elephantidae.animalSound = "trumpet";

        elephantidae.printAnimalName();
        elephantidae.printAnimalSound();
        elephantidae.printleftInTheWild();

        cetacea.name = "whales";
        cetacea.isEndangered = true;
        cetacea.leftInTheWild= new int[]{1500000,50000,15000};
        cetacea.animalSound = "phwargh";

        cetacea.printAnimalName();
        cetacea.printAnimalSound();
        cetacea.printleftInTheWild();



        rhinocerotidae.name ="rhinocerous";
        rhinocerotidae.isEndangered=false;
        rhinocerotidae.leftInTheWild= new int[]{45000,1234567,890987};
        rhinocerotidae.animalSound="squeak";

        rhinocerotidae.printAnimalName();
        rhinocerotidae.printAnimalSound();
        rhinocerotidae.printleftInTheWild();




    }
}
