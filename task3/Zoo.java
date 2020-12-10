package task3;

import java.util.ArrayList;

public class Zoo {
    static ArrayList<Animal> animals = new ArrayList();

    public String makeAllSounds() {
        String allSounds = "";
        for (Animal currentAnimal : animals) {
            allSounds += currentAnimal.makeSound();
        }
        return allSounds;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public String printNumberOfLegs() {
        int numberOfLegs = 0;
        for (Animal currentAnimal : animals) {
            numberOfLegs += currentAnimal.getNumberOFLegs();
        }
        return "Total number of legs in my zoo " + numberOfLegs;
    }
}
