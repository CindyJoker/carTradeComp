package MysqlSet;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GetInfo {
	
	public static void getDetailsOfcar(int regn, Connection con) throws SQLException{
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM cars INNER JOIN model USING(modelNo) WHERE regNum = " + regn);
		
		while (rs.next()){
			int rn = rs.getInt("regNum");
			String mn = rs.getString("manufName");
			Date y = rs.getDate("madeYear");
			int dis = rs.getInt("distance");
			String son = rs.getString("SoldOrNot");
			int mon = rs.getInt("modelNo");
			int custn = rs.getInt("custNo");
			String moname = rs.getString("modelName");
			String perf = rs.getString("performance");
			int seats = rs.getInt("numOfSeats");
			System.out.println("Register number: " + rn);
			System.out.println("Manufacturer's name: " + mn);
			System.out.println("Made year: " + y);
			System.out.println("Distance: " + dis);
			System.out.println("Sold or not: " + son);
			System.out.println("Model number: " + mon);
			System.out.println("Customer number: " + custn);
			System.out.println("Model name: " + moname);
			System.out.println("Performance: " + perf);
			System.out.println("Number of seats: " + seats);
		}
		
		rs.close();
		st.close();

	}
	
	public static void getAvailableCars(Connection con) throws SQLException{
		
		List<cars> list = new ArrayList<cars>();
		
			
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE soldOrNot='Rent' OR soldOrNot IS NULL");
		
		while(rs.next()){
			int rn = rs.getInt("regNum");
			String mn = rs.getString("manufName");
			Date y = rs.getDate("madeYear");
			int dis = rs.getInt("distance");
			String son = rs.getString("SoldOrNot");
			int mon = rs.getInt("modelNo");
			int custn = rs.getInt("custNo");
			
			cars c = new cars(rn, mn, y, dis, son, mon, custn);
			list.add(c);
			
		}
		System.out.println("regNum \t"+ "manufName \t \t \t"+ "madeYear \t"+"distance \t"+"SoldOrNot \t"+
				"modelNo \t"+"custNo \t" );
		for(int i=0; i<list.size(); i++){
			System.out.printf("%-10d", list.get(i).getregn());
			System.out.printf("%-10s",list.get(i).getmfn());
			System.out.printf("\t \t \t"+"%-20s",list.get(i).getmdy());
			System.out.printf("%-10d",list.get(i).getdis());
			System.out.printf("%-10s",list.get(i).getcondition());
			System.out.printf("%-10d",list.get(i).getmodNo());
			System.out.printf(list.get(i).getcustno()+"\n");
			
		}
		rs.close();
		st.close();
	}
	
}
