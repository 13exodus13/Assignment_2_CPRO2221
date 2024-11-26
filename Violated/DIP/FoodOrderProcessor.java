// FoodOrderProcessor.java
public class FoodOrderProcessor {
    private EmailNotification notification = new EmailNotification();

    public void processOrder() {
        System.out.println("Processing food order");
        notification.sendEmail();
    }
}