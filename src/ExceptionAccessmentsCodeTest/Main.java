package ExceptionAccessmentsCodeTest;

import java.util.List;

public class Main {

    public static void main(String[]args){

        List<Order> orders = List.of(
                new OnlineOrder("ON123", "paymentFail"),
                new InStoreOrder("IS456", "outOfStock"),
                new OnlineOrder("ON789", "paymentOK"),
                new InStoreOrder("IS1011", "stockOK")
        );

        for(Order order : orders){
            try{
                if(order.status.equals("paymentFail") || order.status.equals("outOfStock")){
                    order.process();
                }
//                else if(order.status.equals("paymentOK") || order.status.equals("stockOK")){
//                    order.process();
//                }
            }catch(PaymentFailedException e){
                System.out.println("Caught specific exception: " + e.getMessage());
            }catch (OrderException e){
                System.out.println("Caught general exception: " + e.getMessage());
            }catch(InventoryException e){
                System.out.println("Caught unchecked exception: " + e.getMessage());
            }catch(Exception e){
                System.out.println("Unexpected exception: " + e.getMessage());
            }
        }

    }
}



