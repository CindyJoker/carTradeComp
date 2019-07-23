package MysqlSet;

import java.util.Scanner;

public class customers {
	
	private int custNo;
	private String custName;
	private String address;
	private int telNumber;
	
	public customers(int custn, String name, String addr, int tel){
		this.custNo = custn;
		this.custName = name;
		this.address = addr;
		this.telNumber = tel;
	}
	
	// get and set
	public int getcustn() {return custNo;}
	public void setcustn(int custn) {this.custNo = custn;}
	public String getcustname() {return custName;}
	public void setcustname(String custname) {this.custName = custname;}
	public String getaddr() {return address;}
	public void setaddr(String addr) {this.address = addr;}
	public int gettel() {return telNumber;}
	public void settel(int tel) {this.telNumber = tel;}
	
public static customers newcustomer(){
		
		System.out.println("The customer number:");
		Scanner in3 = new Scanner(System.in);
		int custn = in3.nextInt();
		System.out.println("The customer name:");
		Scanner in2 = new Scanner(System.in);
		String custname = in2.nextLine();
		System.out.println("The address:");
		Scanner in4 = new Scanner(System.in);
		String addr = in4.nextLine();
		System.out.println("The tel number:");
		Scanner in1 = new Scanner(System.in);
		int teln = in1.nextInt();
		
		customers cm = new customers(custn, custname, addr, teln);

		return cm;
	}

}
