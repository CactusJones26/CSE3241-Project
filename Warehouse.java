public class Warehouse {

    // Class variables
    private int droneCapacity;
    private int storageCapacity;
    private String warehouseId;
    private String city;
    private String address;
    private String phoneNumber;
    private String manager;

    // Constructor
    public Warehouse(String warehouseId, int droneCapacity, int storageCapacity, String city, String address, String phoneNumber, String manager) {
        this.warehouseId = warehouseId;
        this.droneCapacity = droneCapacity;
        this.storageCapacity = storageCapacity;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.manager = manager;
    }

    /*-------- Getter Methods -------*/
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public int getDroneCapacity() {
        return this.droneCapacity;
    }

    public int getStorageCapacity() {
        return this.storageCapacity;
    }

    public String getCity() {
        return this.city;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    } 

    public String getManager() {
        return this.manager;
    }

    /*-------- Setter Methods --------*/
    public void setWarehouseId(String id) {
        this.warehouseId = id;
    }

    public void setDroneCapacity(int capacity) {
        this.droneCapacity = capacity;
    }

    public void setStorageCapacity(int capacity) {
        this.storageCapacity = capacity;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; 
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
