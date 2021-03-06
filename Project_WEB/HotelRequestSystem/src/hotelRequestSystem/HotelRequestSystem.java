package hotelRequestSystem;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(name = "HotelRequestSystem", urlPatterns = {"/HotelRequestSystem"})
public class HotelRequestSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			ClientRequestBean clientReuest = new ClientRequestBean();
			clientReuest.setName(request.getParameter("Name"));
			clientReuest.setNumberOfSeats(request.getParameter("NumberOfSeats"));
			clientReuest.setRoomClass(request.getParameter("RoomClass"));
			clientReuest.setComingDate(request.getParameter("ComingDate"));
			clientReuest.setNumberOfDays(request.getParameter("NumberOfDays"));
			
			clientReuest = ClientRequestDAO.insert(clientReuest);
					
			
		} catch (Throwable theException) {
			System.out.println(theException);
		}
		
		response.sendRedirect("WaitAnswer.jsp");
		
/*
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String mame = request.getParameter("Name");
		String numberOfSeats = request.getParameter("NumberOfSeats");
		String roomClass = request.getParameter("RoomClass");
		String comingDate = request.getParameter("ComingDate");
		String numberOfDays = request.getParameter("NumberOfDays");
		
		String url = "jdbc:mysql://localhost:3306/hotelrequestsystem";
		String user = "root";
		String password = "root";
		
		String udateDB = "INSERT INTO clientrequest (name, numberOfSeats, roomClass, comingDate, numberOfDays) VALUES ('" + mame + "', " + numberOfSeats + ", " + roomClass + ", '" + comingDate + "', " + numberOfDays + ")";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(udateDB);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("WaitAnswer.jsp");
		
*/		
		
//		PrintWriter out = response.getWriter();
//		out.println("Your request taken. Wait answer of administrator.");
		
	}

}
