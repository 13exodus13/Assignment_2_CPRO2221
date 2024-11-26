public class DiscountCalculator {
    public double calculateDiscount(String customerType) {
        if (customerType.equals("Regular")) {
            return 0.1;
        } else if (customerType.equals("Premium")) {
            return 0.2;
        }
        return 0;
    }
}