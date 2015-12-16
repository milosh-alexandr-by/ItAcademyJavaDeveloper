package main;

import connection.DBConnection;

public class Main {

	public static void main(String[] args) {
		DBConnection connect = new DBConnection("localhost:3306", "root", "root", "milosh");
		connect.initProperties();
		connect.init();

	}

}
