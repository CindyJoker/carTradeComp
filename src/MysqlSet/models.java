package MysqlSet;

import java.util.Scanner;

public class models {
	
	private String modelName, performance;
	private int modelNo, numOfSeats;
	
	public models(int modn, String modname, String perfo, int numos){
		this.modelNo = modn;
		this.numOfSeats = numos;
		this.modelName = modname;
		this.performance = perfo;
	}
	
	// get and set
	public int getmdn() {return modelNo;}
	public void setmdn(int mdn) {this.modelNo = mdn;}
	public int getseats() {return numOfSeats;}
	public void setseats(int seats) {this.numOfSeats = seats;}
	public String getmodname() {return modelName;}
	public void setmodname(String modname) {this.modelName = modname;}
	public String getperfo() {return performance;}
	public void setperfo(String perfo) {this.performance = perfo;}
	
	public static models newmodel(){
		System.out.println("The model number is:");
		Scanner in1 = new Scanner(System.in);
		int modn = in1.nextInt();
		System.out.println("The model name is:");
		Scanner in2 = new Scanner(System.in);
		String modname = in2.nextLine();
		System.out.println("The car's performance:");
		Scanner in3 = new Scanner(System.in);
		String perf = in3.nextLine();
		System.out.println("The number of seats:");
		Scanner in4 = new Scanner(System.in);
		int nos = in4.nextInt();
		
		models m = new models(modn, modname, perf, nos);
		return m;
	}
}
