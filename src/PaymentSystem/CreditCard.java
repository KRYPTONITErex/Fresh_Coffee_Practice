package PaymentSystem;

class CreditCard extends AbstractPaymentMethod{

    @Override
    public void processPayment(double amount) {
        logTransaction(amount);
        System.out.println("Payment Processing with CreditCard amount of : " + amount);
    }
}

class PayPal extends AbstractPaymentMethod{

    @Override
    public void processPayment(double amount) {
        logTransaction(amount);
        System.out.println("Payment Processing with PayPal amount of : " + amount);
    }
}

class BankTransfer extends AbstractPaymentMethod{

    @Override
    public void processPayment(double amount) {
        logTransaction(amount);
        System.out.println("Payment Processing with BankTransfer amount of : " + amount);
    }
}

class Bitcoin extends AbstractPaymentMethod{

    @Override
    public void processPayment(double amount) {
        logTransaction(amount);
        System.out.println("Payment Processing with Bitcoin amount of : " + amount);
    }
}