package Assignment;

/*Design an Online Payment System with an abstract class PaymentMethod containing an abstract method processPayment(). 
Create two derived classes: CreditCard and PayPal, each implementing the processPayment() method differently 
(for example, one might charge a fee, and the other might not). Create a method processTransaction(PaymentMethod paymentMethod) 
that accepts a PaymentMethod object and processes the payment by calling processPayment(). Demonstrate polymorphism by using both 
CreditCard and PayPal objects in the transaction processing system. */

abstract class PaymentMethod {
    public abstract void processPayment(double amount);
}


class CreditCard extends PaymentMethod {
    private static final double TRANSACTION_FEE = 2.0; 

    @Override
    public void processPayment(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        System.out.println("Processing credit card payment of $" + totalAmount + " (including $" + TRANSACTION_FEE + " fee)");
    }
}


class PayPal extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}


class PaymentProcessor {
    public void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}


public class OnlinePaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        System.out.println("--- Performing Transactions ---");
        processor.processTransaction(creditCard, 100.0);
        processor.processTransaction(payPal, 100.0); 
    }
}
