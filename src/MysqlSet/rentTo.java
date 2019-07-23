package MysqlSet;


public class rentTo {
	
	private double rentPrice;
	private String rentDate;
	private int membNo;
	private int regNum;
	
	public rentTo(double rp, String rd, int membn, int regn){
		this.rentPrice = rp;
		this.rentDate = rd;
		this.membNo = membn;
		this.regNum = regn;
	}
	
	// get and set
	public int getmn() {return membNo;}
	public void setmn(int memn) {this.membNo = memn;}
	public String getdate() {return rentDate;}
	public void setdate(String d) {this.rentDate = d;}
	public double getrentp() {return rentPrice;}
	public void setrentp(double rentp) {this.rentPrice = rentp;}
	public int getregn() {return regNum;}
	public void setregn(int rn) {this.regNum = rn;}
}
