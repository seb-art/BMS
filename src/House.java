public class House extends Building{
    private int noOfFloors;
    public House(int id, int noOfFloors){
        super(id, noOfFloors);
    }

    @Override
    public void modifyBuilding() {

    }

    @Override
    public void printBuilding() {
        System.out.println(getRoomQty());

    }

    @Override
    public String toString() {
        return "House{" +
                "noOfFloors=" + noOfFloors +
                '}';
    }
}
