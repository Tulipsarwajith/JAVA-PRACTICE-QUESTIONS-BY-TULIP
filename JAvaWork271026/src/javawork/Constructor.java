package javawork;

public class Constructor {
	
	String name;
	int age;
	
	public void constructor() {
		System.out.println("Default constructor");
		
	}
	
	public void constructor(String name) {
		this.name=name;
		System.out.println("name is :"+name);
	}
	
	public void constructor(int age) {
		this.age=age;
		System.out.println("Age is :"+age);
	}
	
	public void constructor(String name,int age) {
		this.age=age;
		this.name=name;
		System.out.println("Name is : "+name+" and Age is "+age);
	}
	
	public static void main(String[]args) {
		
		Constructor c = new Constructor();
		
		c.constructor();
		
		Constructor c1 = new Constructor();
		
		c1.constructor("Tulip");
		
		Constructor c2 = new Constructor();
		
		c2.constructor(23);
		
		Constructor c3 = new Constructor();
		
		c3.constructor("Tulip",23);

	}
	
	

}
