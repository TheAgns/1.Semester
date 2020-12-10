package task2;
public class Room {
  private Walls walls;
  private int numberOfDoor;
  private int numberOfLambs;
  private int numberOfWindows;

    public Room(Walls walls, int numberOfDoor, int numberOfLambs, int numberOfWindows) {
        this.walls = walls;
        this.numberOfDoor = numberOfDoor;
        this.numberOfLambs = numberOfLambs;
        this.numberOfWindows = numberOfWindows;
    }

    public Walls getWalls() {
        return walls;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public int getNumberOfLambs() {
        return numberOfLambs;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    @Override
    public String toString() {
        return "\n"+ "Room =" +
                " numberOfDoor=" + numberOfDoor +
                " numberOfLambs=" + numberOfLambs +
                " numberOfWindows=" + numberOfWindows +
                '}';
    }
}
