package javawork;

public class LoginProgram {
	
	int id;
	String username;
	String password;
	String mobilenumber;
	
	void login(String username,String password) {
		this.username=username;
		this.password=password;
		
		System.out.println("You had login through username and password ");
		System.out.println();
	}
	
	void login1(int id,String password) {
		this.id=id;
		this.password=password;
		
		System.out.println("You had login through id and Password ");
		System.out.println();
	}
	
	void login2(String mobilenumber,String password) {
		
		this.mobilenumber=mobilenumber;
		this.password=password;
		
		System.out.println("You had login through mobile number and password");
		
	}
	
	public static void main(String[]args) {
		
		LoginProgram l = new LoginProgram();
		
	    l.login("Tulip", "str123");
	    
	    l.login1(1, "abcde");
	    
	    l.login2("8974629374", "dakaaa");
	}

}
