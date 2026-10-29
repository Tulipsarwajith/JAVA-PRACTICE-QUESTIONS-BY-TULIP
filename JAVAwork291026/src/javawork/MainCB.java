package javawork;

public class MainCB {
	public static void main(String[]args) {
		
			
			CabBooking m = new Minivan("Tulip",5);
			CabBooking a = new Autocab("Murali",10);
			CabBooking s = new Sedancab("Shiva",20);
			
			m.bookride();
			m.rate();
			
			System.out.println();
			
			a.bookride();
			a.rate();
			
			System.out.println();
			
			s.bookride();
			s.rate();
			
		}

	}


