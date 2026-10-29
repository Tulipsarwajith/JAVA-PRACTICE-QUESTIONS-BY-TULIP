package javawork;

interface CabBooking {
	
  void bookride();
  void rate();
	
}

class Minivan implements CabBooking{

	private String customername;
	private int distance;
	

	public Minivan(String customername, int distance) {
		// TODO Auto-generated constructor stub
		this.customername=customername;
		this.distance=distance*100;
		
		System.out.println();
	}

	@Override
	public void bookride() {
		// TODO Auto-generated method stub
		
		System.out.println("Thank You "+ customername+" for booking had booked minivan");
		
	}

	@Override
	public void rate() {
		// TODO Auto-generated method stub
		
		System.out.println(" Your rate for minivan is "+distance);
		
	}
	
	
}

class Autocab implements CabBooking{

	private Object customername;
	private int distance;

	public Autocab(String customername, int distance) {
		// TODO Auto-generated constructor stub
		this.customername=customername;
		this.distance=distance*150;
	}

	@Override
	public void bookride() {
		// TODO Auto-generated method stub
		
		System.out.println("Thank You "+customername+" for booking  Autocab");
		
	}

	@Override
	public void rate() {
		// TODO Auto-generated method stub
		
		System.out.println(" Your rate for Autocab is "+distance);
		
	}
	
	
}

class Sedancab implements CabBooking{

	private String customername;
	private int distance;

	public Sedancab(String customername, int distance) {
		// TODO Auto-generated constructor stub
		this.customername=customername;
		this.distance=distance*200;
	}

	@Override
	public void bookride() {
		// TODO Auto-generated method stub
		
		System.out.println("Thank You "+customername+" for booking Sedancab");
		
	}

	@Override
	public void rate() {
		// TODO Auto-generated method stub
		
		System.out.println(" Your rate for Sedancab is "+distance);
		
	}
	
	
}






