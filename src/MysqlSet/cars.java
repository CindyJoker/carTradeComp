package MysqlSet;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class cars {
	
	private int regNum;
	private String manufName;
	private Date madeYear;
	private int distance;
	private String soldOrNot;
	private int modelNo;
	private int custNo;
	
	public cars(int regn, String maName, Date my, int dis, String snot, int moNo, int custn){
		this.regNum = regn;
		this.manufName = maName;
		this.madeYear = my;
		this.distance = dis;
		this.soldOrNot = snot;
		this.modelNo = moNo;
		this.custNo = custn;
	}
	
	// get and set function
	public int getregn() {return regNum;}
	public void setregn(int regn) {this.regNum = regn;}
	public String getmfn() {return manufName;}
	public void setmfn(String mfn) {this.manufName = mfn;}
	public Date getmdy() {return madeYear;}
	public void setmdy(Date mdy) {this.madeYear = mdy;}
	public int getdis() {return distance;}
	public void  setdis(int dis) {this.distance = dis;}
	public String getcondition() {return soldOrNot;}
	public void setcodition(String condition) {this.soldOrNot = condition;}
	public int getmodNo() {return modelNo;}
	public void setmodn(int modn) {this.modelNo = modn;}
	public int getcustno() {return custNo;}
	public void setcustno(int custno) {this.custNo = custno;}
	
	public static cars newcar() throws ParseException{
		
		System.out.println("The registration number:");
		Scanner in1 = new Scanner(System.in);
		int regn = in1.nextInt();
		System.out.println("The manufacturer's name:");
		Scanner in2 = new Scanner(System.in);
		String mafn = in2.nextLine();
		System.out.println("The made date:");
		Scanner in3 = new Scanner(System.in);
		String mady = in3.nextLine();
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = d.parse(mady);
		@SuppressWarnings("deprecation")
		java.sql.Date datesql = new java.sql.Date(date.getTime());
		System.out.println("The model number:");
		Scanner in4 = new Scanner(System.in);
		int modn = in4.nextInt();
		
		cars c = new cars(regn, mafn, datesql, 0, null, modn, 0);
		System.out.println("You also need to store the model information of this new car:");
		
		return c;
	}

}
