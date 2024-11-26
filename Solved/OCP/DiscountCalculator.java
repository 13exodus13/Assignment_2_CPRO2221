// File: Solved/OCP/DiscountCalculator.java

public class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double orderTotal) {
        return strategy.calculateDiscount(orderTotal);
    }
}
