package task2;

import java.util.ArrayList;

public class Building {
    private int numberOfBathrooms;
    private int numberOfFloors;
    boolean isOfficeBuilding;
    private static ArrayList<Room> rooms;

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding, ArrayList<Room> rooms) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public static int totalLamps() {
        int lamps = 0;
        for(int i = 0; i < rooms.size(); i++){
            lamps += rooms.get(i).getNumberOfLambs();
        }
            return lamps;
    }

    public void oddBuilding() {
        if (numberOfFloors > rooms.size()) {
            System.out.println("This is an odd buidling");
        }
    }

    @Override
    public String toString() {
        return "Building|" +
                " numberOfBathrooms = " + numberOfBathrooms +
                ", numberOfFloors = " + numberOfFloors +
                ", isOfficeBuilding = " + isOfficeBuilding +
                "\n"+ "Rooms:" + rooms +
                '}';
    }

}
