package hotelRequestSystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckAdminServlet")
public class CheckAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String loginAdmin = request.getParameter("un");
		String passwordAdmin = request.getParameter("pw");
		
		String url = "jdbc:mysql://localhost:3306/hotelrequestsystem";
		String user = "root";
		String password = "root";
		
        String searchQuery =
	               "select * from administrator where login='"
	                        + loginAdmin
	                        + "' AND password='"
	                        + passwordAdmin
	                        + "'";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			
			if (!more) 
	         {
	            System.out.println("Sorry, you are not a registered user! Please sign up first");
	         } 
		        
	         //if user exists set the isValid variable to true
	         else if (more) 
	         {
	        	response.sendRedirect("Administrator.jsp");
//	            String firstName = rs.getString("FirstName");
//	            String lastName = rs.getString("LastName");
//		     	
//	            System.out.println("Welcome " + firstName);
//	            bean.setFirstName(firstName);
//	            bean.setLastName(lastName);
//	            bean.setValid(true);
	         }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}



}
