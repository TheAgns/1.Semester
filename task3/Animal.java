package task3;

public class Animal implements AnimalSound{


    private int numberOFLegs;

    public Animal(int numberOFLegs) {
        this.numberOFLegs = numberOFLegs;
    }

    public int getNumberOFLegs() {
        return numberOFLegs;
    }

    public String makeSound() {
      return "Undefined animal makes no sound";
    }
}
