package ExceptionAccessments;


abstract class Order{
    String orderKeyword;
    String paymentStatus;

    public Order(String orderKeyword, String paymentStatus){
        this.orderKeyword = orderKeyword;
        this.paymentStatus = paymentStatus;
    }

    abstract void process() throws PaymentFailedException,InventoryException;
}

class OnlineOrder extends Order{
    public OnlineOrder(String orderKeyword, String paymentStatus){
        super(orderKeyword,paymentStatus);
    }
    @Override
    public void process() throws PaymentFailedException {
        System.out.println("Processing order: OnlineOrder");
        if(paymentStatus.equals("paymentFail")){
            throw new PaymentFailedException("Payment failed for online order: " + orderKeyword);
        }
    }
}

class InStoreOrder extends Order{
    public InStoreOrder(String orderKeyword, String paymentStatus){
        super(orderKeyword, paymentStatus);
    }
    @Override
    public void process() throws InventoryException {
        System.out.println("Processing order: InStoreOrder");
        if(paymentStatus.equals("paymentFail")){
            throw new InventoryException("Inventory error for in-store order: " + orderKeyword);
        }
    }
}
