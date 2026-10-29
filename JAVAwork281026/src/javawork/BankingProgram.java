package javawork;

public class BankingProgram {
	
	int amount;
	String chequeno;
	String upiid;
	String bank_name;
	
	void deposit(int amount) {
		this.amount=amount;
		
		System.out.println("You had deposited your amount ");
		System.out.println();
	}
	
	void deposit(int amount,String chequeno) {
		
		this.amount=amount;
		this.chequeno=chequeno;
		
		System.out.println("You had deposited through cheque ");
		System.out.println();
	}
	
	void deposit(int amount,String upiid,String bank_name) {
		
		this.amount=amount;
		this.upiid=upiid;
		this.bank_name=bank_name;
		
		System.out.println("You had deposited through upiid and bank_name");
		
	}
	
	public static void main(String[]args) {
		
		BankingProgram b = new BankingProgram();
		
		b.deposit(4000);
		b.deposit(4000,"tulip12434");
		b.deposit(6000," tulip@upiid ", " PNB ");
	}

}
