import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	private Scanner s;
	private Data d;
	
	public Menu() {
		this.s = new Scanner(System.in);
		this.d = new Data();
	}
	
	public void begin() {
		while (true) {
    		System.out.println("Database Menu");
    		System.out.println("1: Add new record");
    		System.out.println("2: Edit/Delete record");
    		System.out.println("3: Search record");
    		System.out.println("4: Useful report");
    		System.out.println("5: Exit");
    		
    		int userInput = s.nextInt();
    		
    		switch (userInput) {
    			case 1:
    				addOptions();
    				break;
    			case 2:
    				editOptions();
    				break;
    			case 3: 
    				searchOptions();
    				break;
    			case 4:
    				// usefulOptions();
    				break;
    			case 5:
    				System.out.println("Shutting Down!");
    				System.exit(0);
    				break;
    		}
    	}
	}
	
	/**
	 * Can add members, warehouse, equipment
	 */
	public void addOptions() {
		System.out.println("-----Add Options-----");
		System.out.println("1: Add a member");
		System.out.println("2: Add a warehouse");
		System.out.println("3: Add equipment");
		int addOption = s.nextInt();
		
		switch (addOption) {
			// Add a member
			case 1:
				/** @ASK How do we implement userId */
				System.out.println("--------ADD A MEMBER--------");
				System.out.print("Enter the userID: ");
				String userId = s.next();
				
				System.out.print("Enter the first name of the member: ");
				String fName = s.next();
				
				System.out.print("Enter the last name of the member: ");
				String lName = s.next();
				
				System.out.print("Enter the address of the member: ");
				String address = s.next();
				
				System.out.print("Enter the phone number of the member: ");
				String phoneNumber = s.next();
				
				System.out.print("Enter the email of the member: ");
				String email = s.next();
				
				System.out.print("Enter the current date: ");
				String startDate = s.next();
				
				/** Perform the query (this) denotes a tuple */
				try {
					String sqlQuery = "INSERT INTO MEMBER (First_name, Last_Name, Address, Phone, Email, Start_date) VALUES (?, ?, ?, ?, ?, ?)";
					PreparedStatement pStatement = Main.conn.prepareStatement(sqlQuery);
					pStatement.setString(1, fName);
					pStatement.setString(2, lName);
					pStatement.setString(3, address);
					pStatement.setString(4, phoneNumber);
					pStatement.setString(5, email);
					pStatement.setString(6, startDate);
					pStatement.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
				System.out.println("\nMember " + userId + " successfully added!");
				break;
				
			// Add a warehouse
			case 2: 
				System.out.println("--------ADD A WAREHOUSE--------");
				System.out.print("Enter the warehouse ID: ");
				String warehouseId = s.next();
				
				System.out.print("Enter the drone capacity of the warehouse: ");
				int droneCap = s.nextInt();
				
				System.out.print("Enter the storage capacity of the warehouse: ");
				int storageCap = s.nextInt();
				
				System.out.print("Enter the city the warehouse is located in: ");
				String city = s.next();
				
				System.out.print("Enter the warehouse address: ");
				String warehouseAddress = s.next();
				
				System.out.print("Enter the warehouse phone number: ");
				String warehousePhoneNumber = s.next();
				
				System.out.print("Enter the manager of the warehouse: ");
				String manager = s.next();
				
				Warehouse w = new Warehouse(warehouseId, droneCap, storageCap, city, warehouseAddress, warehousePhoneNumber, manager);
				d.addWarehouse(w);
				System.out.println("\nWarehouse " + warehouseId + " successfully added!");
				break;
				
			// Add equipment
			case 3: 
				
		}
	}
	
	/**
	 * Can edit/delete records: member, warehouse, equipment
	 */
	public void editOptions() {
		System.out.println("-----Edit Options-----");
		System.out.println("1: Delete a member");
		System.out.println("2: Delete a warehouse");
		System.out.println("3: Delete equipment");
		System.out.println("4: Edit a member");
		System.out.println("5: Edit a warehouse");
		System.out.println("6: Edit equipment");
		
		int userSelection = s.nextInt();
		
		
		switch (userSelection) {
			// Delete a member
			case 1: 
				System.out.print("Enter the user id of the member you wish to delete: ");
				String userId = s.next();
				d.deleteMember(userId);
			// Delete a warehouse
			case 2:
				System.out.print("Enter the warehouse id of the warehouse you wish to delete: ");
				String warehouseId = s.next();
				d.deleteWareHouse(warehouseId);
			// Delete equipment
			case 3: 
				System.out.print("Enter the equipment id of the equipment you wish to delete: ");
				String equipId = s.next();
				d.deleteEquipment(equipId);
		}
		
	}
	
	public void searchOptions() {
		
	}
	
}
