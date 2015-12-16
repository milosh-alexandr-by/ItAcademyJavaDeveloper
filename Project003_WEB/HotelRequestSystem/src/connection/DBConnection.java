package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection {
	private String host;
	private String user;
	private String password;
	private String nameDataBase;
	private String url;
	
	private Properties properties = new Properties();
	private Connection mysqlConnect;
	
	public DBConnection (String host, String user, String password, String nameDataBase) {
		this.host = host;
		this.user = user;
		this.password = password;
		this.nameDataBase = nameDataBase;
	}
		
		public void initProperties() {
			
			url = "jdbc:mysql://" + host + "/" + nameDataBase + "";
			
			properties.setProperty("user", user);
			properties.setProperty("password", password);
			properties.setProperty("characterEncoding", "UTF-8");
			properties.setProperty("useUnicode", "true");
			
			System.out.println("URL: " + url);
		}
		
		public void init() {
			if (mysqlConnect == null) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					mysqlConnect = DriverManager.getConnection(url, user, password);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}
		
		public void finalaze() {
			try {
				mysqlConnect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public ResultSet query (String query) {
			ResultSet result = null;
			try {
				Statement stmt = mysqlConnect.createStatement();
				 result = stmt.executeQuery(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
		
		public void updateQuery (String query) {
			try {
				Statement stmt = mysqlConnect.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			

}