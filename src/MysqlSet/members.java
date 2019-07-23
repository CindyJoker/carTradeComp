package MysqlSet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class members {
	
	private int membNo;
	private Date dateOfJoin;
	private int custNo;
	
	public members(int membn, Date doj, int custn){
		this.membNo = membn;
		this.dateOfJoin = doj;
		this.custNo = custn;
	}
	
	// get and set
	public int getmembno() {return membNo;}
	public void setmembno(int membno) {this.membNo = membno;}
	public Date getdoj() {return dateOfJoin;}
	public void setdoj(Date doj) {this.dateOfJoin = doj;}
	public int getcustno() {return custNo;}
	public void setcustno(int custno) {this.custNo = custno;}
	
public static members newmember() throws ParseException{
		
		System.out.println("The member number:");
		Scanner in1 = new Scanner(System.in);
		int memn = in1.nextInt();
		System.out.println("The join date:");
		Scanner in2 = new Scanner(System.in);
		String jd = in2.nextLine();
		// Get date of "yyyy-mm-dd" format
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = d.parse(jd);
		@SuppressWarnings("deprecation")
		java.sql.Date datesql = new java.sql.Date(date.getTime());
		System.out.println("The customer number:");
		Scanner in3 = new Scanner(System.in);
		int custn = in3.nextInt();
		System.out.println("A new member is also a customer, you have to inert the customer's information.");
		
		members m = new members(memn, datesql, custn);

		return m;
	}
}
