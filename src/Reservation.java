public class Reservation {
    private String dateOfReservation;
    private String dateOfOccupying;
    private String dateOfLeaving;
    private int numberOfPeople;

    public Reservation(String dateOfReservation, String dateOfOccupying, String dateOfLeaving, int numberOfPeople) {
        this.dateOfReservation = dateOfReservation;
        this.dateOfOccupying = dateOfOccupying;
        this.dateOfLeaving = dateOfLeaving;
        this.numberOfPeople = numberOfPeople;
    }

    public String getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(String dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public String getDateOfOccupying() {
        return dateOfOccupying;
    }

    public void setDateOfOccupying(String dateOfOccupying) {
        this.dateOfOccupying = dateOfOccupying;
    }

    public String getDateOfLeaving() {
        return dateOfLeaving;
    }

    public void setDateOfLeaving(String dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
