package javawork;

public class CarRentalProgram {
	
	int hours;
	int days;
	boolean isdaily;
	int amount;
	boolean isdriver;
	
	void forhours(int hours) {
		this.hours=hours;
		System.out.println("You had booked a car for "+hours+" hours");
		System.out.println();
	}
	
	void fordays(boolean isdaily,int days) {
		this.isdaily=isdaily;
		this.days=days;
		if(isdaily) {
			System.out.println("You had booked a car daily for "+days+" days");
		}else {
			System.out.println("You had booked a car for "+days+" days but not daily");
		}
		System.out.println();
	}
	
	void withdriver(int days,int amount,boolean isdriver) {
		this.days=days;
		this.amount=amount;
		this.isdriver=isdriver;
		
		if(isdriver) {
			System.out.println("You had booked a car with driver for "+days+" days");
		}else {
			System.out.println("You had booked a car without a driver for "+days+" days");
		}
		System.out.println();
	}
	
	public static void main(String[]args) {
		
		CarRentalProgram c = new CarRentalProgram();
		
		c.forhours(4);
		c.fordays(true, 4);
		c.withdriver(3, 3000, true);
	}
	

}
