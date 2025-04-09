package PaymentSystem;

public class PaymentProcessor {

    public static void main(String[]args){

        PaymentMethod creditCard = new CreditCard();
        creditCard.processPayment(12.5);

        PaymentMethod paypal = new PayPal();
        paypal.processPayment(15.5);

        PaymentMethod bankTransfer = new BankTransfer();
        bankTransfer.processPayment(20.5);

        PaymentMethod bitcoin = new Bitcoin();
        bitcoin.processPayment(25.5);

    }
}
