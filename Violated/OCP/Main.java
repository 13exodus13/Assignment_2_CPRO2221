

// Usage
public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular discount: " + calculator.calculateDiscount("Regular"));
        System.out.println("Premium discount: " + calculator.calculateDiscount("Premium"));
    }
}
