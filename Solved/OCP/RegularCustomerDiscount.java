// File: Solved/OCP/RegularCustomerDiscount.java
package Solved.OCP;

public class RegularCustomerDiscount implements DiscountStrategy {
    public double calculateDiscount(double orderTotal) {
        return orderTotal * 0.1;
    }
}