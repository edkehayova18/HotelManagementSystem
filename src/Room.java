public class Room {

    private String roomNumber;
    private String roomFloor;
    private boolean isOccupied;
    private int numberOfBeds;

    public Room(String roomNumber, String roomFloor, boolean isOccupied, int numberOfBeds) {
        this.roomNumber = roomNumber;
        this.roomFloor = roomFloor;
        this.isOccupied = isOccupied;
        this.numberOfBeds = numberOfBeds;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor) {
        this.roomFloor = roomFloor;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void occupyRoom(){

    }

    public void freeRoom(){

    }

}
