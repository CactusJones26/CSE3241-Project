import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Main {
	
	/**
	 * The database file name.
	 * @NOTE: CHANGE THIS TO YOUR LOCAL PATH
	 */
	private static String DATABASE = "";
	
	static Connection conn = null;
	
	public static Connection initializeDB(String databaseFileName) {
		String url = "jdbc:sqlite:" + databaseFileName;
		
		try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("The connection to the database was successful.");
            } else {
            	System.out.println("Null Connection");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("There was a problem connecting to the database.");
        }
        return conn;
	}
	
	public static void sqlQuery(Connection conn, String sql){
        try {
        	Statement stmt = conn.createStatement();
        	ResultSet rs = stmt.executeQuery(sql);
        	ResultSetMetaData rsmd = rs.getMetaData();
        	int columnCount = rsmd.getColumnCount();
        	for (int i = 1; i <= columnCount; i++) {
        		String value = rsmd.getColumnName(i);
        		System.out.print(value);
        		if (i < columnCount) System.out.print(",  ");
        	}
			System.out.print("\n");
        	while (rs.next()) {
        		for (int i = 1; i <= columnCount; i++) {
        			String columnValue = rs.getString(i);
            		System.out.print(columnValue);
            		if (i < columnCount) System.out.print(",  ");
        		}
    			System.out.print("\n");
        	}
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
    public static void main(String[] args) {
    
    	/* 
    	 * Provide Functionality to
    	 * a. Add new records (implement at least 3 of the main records, e.g. members, equipment, warehouse, ...)
    	 * b. Edit/Delete records (e.g. members, equipment, warehouse, ..)
    	 * c. Search (e.g. members, equipment, warehouse, ..)
    	 * d. Useful Reports (not to be implemented yet
    	 * 
    	 */
    	
    	// Connect to the database
    	Connection conn = initializeDB(DATABASE);
    	
    	// Scanner for user input
    	Scanner s = new Scanner(System.in);
    	
    	// Initialize new menu to begin program
    	Menu men = new Menu();
    	
    	// Prompt the user with the begin menu
    	men.begin();
    	
    	
    	// Close the scanner
    	s.close();
    	


    }
}