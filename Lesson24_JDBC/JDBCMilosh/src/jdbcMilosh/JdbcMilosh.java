package jdbcMilosh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMilosh {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	private static final String url = "jdbc:mysql://localhost:3306/hotelrequestsystem";
    private static final String user = "root";
    private static final String password = "root";
  	
	public static void main(String[] args) {
		
		String query = "select * from expenses";
		String update = "insert into expenses (paydate, receiver, value) values ('2010-05-05', 1, 88888)";
		
		Connection con = null;
		Statement stmt = null;
		
	    try {
//	    	Class.forName("com.mysql.jdbc.Driver");
	    	con = DriverManager.getConnection(url, user, password);
	    	stmt = con.createStatement();
	    	String sql = "INSERT INTO clientrequest (name, numberOfSeats, roomClass, comingDate, numberOfDays) VALUES ('Sasha', 2, 3, '2011-11-11', 7);";
	    	stmt.executeUpdate(sql); 
	    	 
//	    	while (rs.next()) {
//	    		System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));}
	    } catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	    }
		

	}

}