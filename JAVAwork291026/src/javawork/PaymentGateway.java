package javawork;


//Interface
interface PaymentGateway {
 void pay(double amount);
}

//Online payment class
class OnlinePayment implements PaymentGateway {

 public void pay(double amount) {
     System.out.println("Payment Mode: Online Payment (UPI)");
     System.out.println("Amount Paid: Rs. " + amount);
     System.out.println("Online payment successful!");
 }
}

//Card payment class
class CardPayment implements PaymentGateway {

 public void pay(double amount) {
     System.out.println("Payment Mode: Debit/Credit Card");
     System.out.println("Amount Paid: Rs. " + amount);
     System.out.println("Card payment successful!");
 }
}
