<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="HotelRooms.jsp" method="GET">
		Show rooms of hotel: <input type="submit" name="ShowRoomsOfHotel" value="Submit">
	</form>
	
	<form action="Client.jsp" method="GET">
		Show clients: <input type="submit" name="ShowClients" value="Submit">
	</form>
	
	<form action="ClientRequest.jsp" method="GET">
		Show requests: <input type="submit" name="ShowRequests" value="Submit">
	</form>

</body>
</html>