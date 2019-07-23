package MysqlSet;

import java.sql.*;
import java.text.ParseException;
import java.util.Scanner;

public class ConnectToDatabase {
	
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/car_company?serverTimezone=UTC";

	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		System.out.println("Connected!");
		
		String s = mux.choice();
		if (s.equals("A")){
			System.out.println("Insert a new car:");
			InsrtInfo.insertCar(cars.newcar(), models.newmodel(), conn);
		}else if (s.equals("B")){
			System.out.println("Insert a new member");
			InsrtInfo.insertMember(members.newmember(), customers.newcustomer(), conn);
		}else if (s.equals("C")){
			System.out.println("Find car details using register number");
			System.out.println("Insert the register number: ");
			@SuppressWarnings("resource")
			Scanner inrn = new Scanner(System.in);
			int regn = inrn.nextInt();
			GetInfo.getDetailsOfcar(regn, conn);
		}else if(s.equals("D")){
			System.out.println("Find all avaliable cars");
			GetInfo.getAvailableCars(conn);
		}
		
		conn.close();
	}

}
