package javawork;

public class OnlineShopping {
	
	int productid;
	String productname;
	int price;
	
	void display(int id,String name,int price) {
		this.productid=id;
		this.productname=name;
		this.price=price;
		
		System.out.println("id : "+id+" Product Name : "+name+" Price : "+price);
	}
	
	class Electronics extends OnlineShopping{
		
		int warranty;
		
		void print(int years) {
			this.warranty=years;
			
			System.out.println("This product has "+years+" Warranty for years ");
			
			System.out.println();
			
		}
		
	}
	
	class Clothing extends OnlineShopping{
		
		String size;
		
		void print(String size) {
			this.size=size;
			
			System.out.println("You had slected the size of the cloth as "+size);
			
			System.out.println();
		}
		
	}
	
	class Food extends OnlineShopping{ 
		
		int expiry;
		
		void print(int expiry) {
			
			this.expiry=expiry;
			
			System.out.println("The food will be expired in "+expiry+" days ");
		}
	}
	
	public static void main(String[]args) {
		
		OnlineShopping o = new OnlineShopping();
		
		OnlineShopping.Electronics e = o.new Electronics();
		
		e.display(1,"Iphone", 80000);
		e.print(4);
		
		OnlineShopping.Clothing c = o.new Clothing();
		
		c.display(1," Shirt ", 1500);
		c.print("Medium");
		
		OnlineShopping.Food f = o.new Food();
		
		f.display(1,"Chicken Fried Rice ", 100);
		f.print(1);
		
		
	}

}
