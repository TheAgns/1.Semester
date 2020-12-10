package task3;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Lion lion = new Lion(4);
        Horse horse = new Horse(5);
        Goose goose = new Goose(2);

        zoo.printNumberOfLegs();
        zoo.addAnimal(lion);
        zoo.addAnimal(horse);
        zoo.addAnimal(goose);
        zoo.makeAllSounds();
        System.out.println(zoo.makeAllSounds());
        System.out.println(zoo.printNumberOfLegs());
        }
    }

