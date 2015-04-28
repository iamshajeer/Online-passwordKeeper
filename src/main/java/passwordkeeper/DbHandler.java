package passwordkeeper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbHandler {
	Connection connection;
	Statement statement;

	final String URL = "jdbc:mysql://localhost/passwordkeeper";
	final String DRIVER = "com.mysql.jdbc.Driver";
	final String DATABASE_NAME = "passwordkeeper";
	final String USER_NAME = "root";
	final String USER_PASSWORD = "";		

	
	public DbHandler() {
		
	}

	public Statement dbConnectionMaker() {
		try {

			Class.forName(DRIVER);

		} catch (ClassNotFoundException e) {

		}

		Connection con;
		try {
			
			connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
			Statement statement = connection.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}

}
