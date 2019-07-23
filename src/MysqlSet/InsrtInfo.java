package MysqlSet;
import java.sql.*;

import com.mysql.cj.Session;
import com.mysql.cj.protocol.x.FieldFactory;

public class InsrtInfo {
	
	/**
	 * Insert information such as 
	 * 
	 * 1. a new car
	 * 
	 * 2. a new member
	 * 
	 */
	
	public static void insertCar(cars car, models m, Connection conn){
		try {
			Connection con = conn;
			Statement st = con.createStatement();
			
			String sqlc = "INSERT INTO cars (regNum, manufName, madeYear, modelNo) VALUES("+car.getregn()+", '"+
					car.getmfn()+"', '"+car.getmdy()+"', "+car.getmodNo()+")";
			String sqlm = "INSERT INTO model VALUES("+m.getmdn()+", '"+m.getmodname()+"', '"+m.getperfo()+"', "+m.getseats()+")";
			//System.out.println(sql);
			st.executeUpdate(sqlc);
			st.executeUpdate(sqlm);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertMember(members member, customers mc, Connection conn){
		try {
			Connection con = conn;
			Statement st = con.createStatement();
			
			String sqlm = "INSERT INTO members VALUES("+member.getmembno()+", '"+member.getdoj()+"', "+
					member.getcustno()+")";
			String sqlc = "INSERT INTO customers VALUES("+mc.getcustn()+", '"+mc.getcustname()+"', '"+
					mc.getaddr()+"', "+mc.gettel()+")";
			st.executeUpdate(sqlm);
			st.executeUpdate(sqlc);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
