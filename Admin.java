public class Admin {

    // Class variables 
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String role;
    private int warehouseId;
    

    // Constructor
    public Admin(String firstName, String lastName, String phoneNumber, String role, int warehouseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.warehouseId = warehouseId;
    }

    /*-------- Getter Methods -------*/
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    } 

    public String getRole() {
        return this.role;
    }

    public int getWarehouseId() {
        return this.warehouseId;
    }

    /*-------- Setter Methods --------*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; 
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setWarehouseId(int id) {
        this.warehouseId = id;
    }
}
