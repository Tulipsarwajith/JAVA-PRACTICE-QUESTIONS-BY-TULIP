package javawork;

 public class Employee {
	
	int empid;
	String empname;
	int salary;
	
	void display(int id,String name,int salary) {
		this.empid=id;
		this.empname=name;
		this.salary=salary;
		System.out.println("id : "+id+" Name : "+name+" salary : "+salary);
		
	}


 
 class Manager extends Employee{
	 
	 void print() {
		 System.out.println("Manager's details");
		 System.out.println();
	 }
	 
 }
 
class Developer extends Employee{
	 
	 void print() {
		 System.out.println("Developer's details");
		 System.out.println();
	 }
	 
 }

class Intern extends Employee{
	 
	 void print() {
		 System.out.println("Intern's details");
		 System.out.println();
	 }
	 
}

	public static void main(String[]args) {
		
		Employee e = new Employee();
		
		Employee.Manager m = e.new Manager();
		m.print();
		m.display(1,"Tulip",50000);
		m.display(2,"Shiva",60000);
		
		System.out.println();
		
		Employee.Developer d = e.new Developer();
		d.print();
		d.display(1,"Murali",70000);
		d.display(2,"Radha",50000);
		
		System.out.println();
		
		Employee.Intern i = e.new Intern();
		i.print();
		i.display(1,"Raju", 250000);
		
		
	}
}
 
