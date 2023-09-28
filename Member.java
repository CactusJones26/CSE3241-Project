public class Member {

    // Class variables 
    private String userId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String startDate;
    private int warehouseDistance;
    

    // Constructor
    public Member(String userId, String firstName, String lastName, String address, String phoneNumber, String email, String startDate, int warehouseDistance) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.startDate = startDate;
        this.warehouseDistance = warehouseDistance;
    }

    /*-------- Getter Methods -------*/
    public String getUserId() {
        return this.userId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    } 

    public String getEmail() {
        return this.email;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public int getWarehouseDistance() {
        return this.warehouseDistance;
    }

    /*-------- Setter Methods --------*/
    public void setUserId(String id) {
        this.userId = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; 
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStartDate(String date) {
        this.startDate = date;
    }

    public void setWarehouseDistance(int distance) {
        this.warehouseDistance = distance;
    }
}
