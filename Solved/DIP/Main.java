// Main.java
public class Main {
    public static void main(String[] args) {
        FoodOrderProcessor emailProcessor = new FoodOrderProcessor(new EmailNotification());
        emailProcessor.processOrder();

        FoodOrderProcessor smsProcessor = new FoodOrderProcessor(new SMSNotification());
        smsProcessor.processOrder();
    }
}