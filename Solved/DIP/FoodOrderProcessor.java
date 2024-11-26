// FoodOrderProcessor.java
public class FoodOrderProcessor {
    private NotificationService notification;

    public FoodOrderProcessor(NotificationService notification) {
        this.notification = notification;
    }

    public void processOrder() {
        System.out.println("Processing food order");
        notification.notifyUser();
    }
}