package PaymentSystem;

abstract class AbstractPaymentMethod implements PaymentMethod{

    protected void logTransaction(double amount) {
        System.out.println("\nTransaction of amount "+ amount + " logged.");
    }
    public abstract void processPayment(double amount);
}