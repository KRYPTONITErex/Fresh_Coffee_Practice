package FreshCoffee_Practice2;

public class DependencyInversionPDe {
    public static void main(String[]args){

        Notification notification = new EmailNotification();
        Notification notification1 = new SMSNotification();

        Employee employee = new Employee(notification);
        Employee employee1 = new Employee(notification1);
        employee.notifyUser();
        employee1.notifyUser();
    }
}
interface Notification{
    void Notify();
}
class EmailNotification implements Notification{
    public void Notify(){
        System.out.println("Notification send via Email");
    }
}
class SMSNotification implements Notification{
    public void Notify(){
        System.out.println("Notification send via SMS");
    }
}

class Employee{
    private final Notification notification;
    Employee(Notification notification){
        this.notification = notification;
    }
    void notifyUser(){
        notification.Notify();
    }
}