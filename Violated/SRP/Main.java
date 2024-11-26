public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.createOrder();
        order.processPayment();
        order.sendNotification();
    }
}
