//Module 5
Q2. To connect to an MS-Access database using JDBC (Java Database Connectivity) driver, you need to follow these steps:
1.	Download JDBC Driver for MS-Access: You need to download the appropriate JDBC driver for MS-Access. Usually, you can find the JDBC driver provided by the database vendor or third-party sources.
2.	Add JDBC Driver to Your Project: Once you download the JDBC driver, you need to add it to your project's classpath.
3.	Load and Register JDBC Driver: In your Java code, you need to load and register the JDBC driver using Class.forName() method.
4.	Establish Connection to Database: Create a connection to the MS-Access database using DriverManager.getConnection() method, passing the database URL, username, and password.
5.	Execute SQL Queries: After establishing the connection, you can execute SQL queries to interact with the database.
Here's an example demonstrating how to connect to an MS-Access database using JDBC driver:
java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MSAccessConnectionExample {
    public static void main(String[] args) {
        // Step 1: Define database URL
        String url = "jdbc:ucanaccess://C:/Path/To/Your/Database/YourDatabase.accdb";

        // Step 2: Define database credentials
        String username = ""; // Leave it empty for MS-Access
        String password = ""; // Leave it empty for MS-Access

        // Step 3: Load and register JDBC driver
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // Step 4: Establish connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to MS-Access database successfully!");

            // Step 5: Execute SQL queries
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM YourTable");

            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                // Process the data as needed
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
