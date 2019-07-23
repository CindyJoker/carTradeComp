package MysqlSet;


public class sellTo {
	
	private int sellNum;
	private String sellDate;
	private double sellPrice;
	private int regNum;
	
	public sellTo(int sn, String sd, double sp, int regn){
		this.sellNum = sn;
		this.sellDate = sd;
		this.sellPrice = sp;
		this.regNum = regn;
	}
	
	// get and sell
	public int getsn() {return sellNum;}
	public void setsn(int selln) {this.sellNum = selln;}
	public String getdate() {return sellDate;}
	public void setdate(String d) {this.sellDate = d;}
	public double getsellp() {return sellPrice;}
	public void setsellp(double sellp) {this.sellPrice = sellp;}
	public int getregn() {return regNum;}
	public void setregn(int rn) {this.regNum = rn;}
}
