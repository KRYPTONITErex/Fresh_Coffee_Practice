package FreshCoffee_Practice2;
public class DIPDe {
    public static void main(String[]args){
        //dun understand below lone
        Notifications notificationsE = new EmailNoti();
        Notifications notificationsS = new SlackNoti();

        Employeee epE = new Employeee(notificationsE);
        epE.Notify();
        Employeee epS = new Employeee(notificationsS);
        epS.Notify();
//        EmailNoti emailNoti = new EmailNoti(); //direct Dependency
//        emailNoti.Notify();
    }
}
interface Notifications{
    void Notify();
}
class EmailNoti implements Notifications{
    String EmailName = "Google";
    public void Notify(){
        System.out.println("Noti send via Email naming "+EmailName);
        System.out.println(EmailName);
    }
}
class SlackNoti implements Notifications{
    String SlackName = "PI Slack";
    public void Notify(){
        System.out.println("Noti send via Slack naming "+SlackName);
        System.out.println(SlackName);
    }
}
class Employeee{
    //dun understand below lone
    Notifications notifications;
    //dun understand below lone
    Employeee(Notifications notifications){ this.notifications = notifications;}

    void Notify(){
        notifications.Notify();
    }
}