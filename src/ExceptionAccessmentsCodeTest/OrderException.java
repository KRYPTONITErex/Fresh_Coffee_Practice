package ExceptionAccessments;

class OrderException extends Exception{
    public OrderException(String message){
        super(message);
    }
}
class PaymentFailedException extends OrderException{
    public PaymentFailedException(String message){
        super(message);
    }
}

class InventoryException extends RuntimeException{
    public InventoryException(String message){
        super(message);
    }
}