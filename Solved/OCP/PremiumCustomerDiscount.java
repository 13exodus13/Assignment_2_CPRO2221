// File: Solved/OCP/PremiumCustomerDiscount.java
package Solved.OCP;

public class PremiumCustomerDiscount implements DiscountStrategy {
    public double calculateDiscount(double orderTotal) {
        return orderTotal * 0.2;
    }
}