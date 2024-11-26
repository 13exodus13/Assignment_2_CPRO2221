
// File: Solved/SRP/Main.java
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        NotificationService notificationService = new NotificationService();

        orderService.createOrder("Pizza", 2);
        paymentService.processPayment(25.99);
        notificationService.sendNotification("Your order is confirmed!");
    }
}