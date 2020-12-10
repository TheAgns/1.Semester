package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Walls walls = new Walls();
        Room room1 = new Room(walls, 1, 3, 2);
        Room room2 = new Room(walls, 2, 4, 3);
        Room room3 = new Room(walls, 3, 5, 2);
        ArrayList<Room> rooms = new ArrayList();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building1 = new Building(3,2,true,rooms);
        System.out.println("This is an odd building");
        building1.oddBuilding();
        System.out.println(building1);
        building1.totalLamps();
        System.out.println("This building has: " + building1.totalLamps()+" lamps");


    }


}
