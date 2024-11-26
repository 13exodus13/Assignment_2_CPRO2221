// File: Solved/OCP/Main.java


public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular discount: $" + 
            calculator.calculateDiscount(new RegularCustomerDiscount(), 100));
        System.out.println("Premium discount: $" + 
            calculator.calculateDiscount(new PremiumCustomerDiscount(), 100));
    }
}
