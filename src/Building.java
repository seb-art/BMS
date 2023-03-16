
import java.util.ArrayList;

public abstract class Building {
    private int noOfRooms;
    private int id;
    private ArrayList<Room> rooms;
public Building(int id, int noOfRooms){
    this.id = id;
    this.noOfRooms = noOfRooms;
}
public ArrayList<Room> addRoom(double length, double width){
    ArrayList<Room> room = new ArrayList<Room>();
    room.add(new Room(length,width));
    return room;
}
public void modifyRoom(int roomNo, double length, double width){
    rooms.set(roomNo,new Room(length,width));
}
public int deleteRoom(int roomNo){
    rooms.remove(roomNo);
    return roomNo;
}
public void printRooms(){

    System.out.println(rooms);
}
public int getRoomQty(){

    return noOfRooms;
}
public abstract void modifyBuilding();
public abstract void printBuilding();
}
