public class Guest {

    private int guestID;
    private String guestFirstName;
    private String guestMiddleName;
    private  String guestLastName;
    private String guestEmail;

    public Guest(int guestID, String guestFirstName, String guestMiddleName, String guestLastName, String guestEmail) {
        this.guestID = guestID;
        this.guestFirstName = guestFirstName;
        this.guestMiddleName = guestMiddleName;
        this.guestLastName = guestLastName;
        this.guestEmail = guestEmail;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestMiddleName() {
        return guestMiddleName;
    }

    public void setGuestMiddleName(String guestMiddleName) {
        this.guestMiddleName = guestMiddleName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public void makeReservation(){

    }

    public void cancleResrvation(){

    }
}
