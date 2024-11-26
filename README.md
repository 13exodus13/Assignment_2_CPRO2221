# Addressing SOLID Principles in a Food Ordering System

This project demonstrates the application of SOLID design principles in a food ordering system. It showcases both violations and correct implementations of three key SOLID principles: Single Responsibility Principle (SRP), Open/Closed Principle (OCP), and Dependency Inversion Principle (DIP).

## Table of Contents
1. [Project Overview](#project-overview)
2. [SOLID Principles Demonstrated](#solid-principles-demonstrated)
3. [Use Case: Food Ordering System](#use-case-food-ordering-system)
4. [Project Structure](#project-structure)
5. [How to Run the Code](#how-to-run-the-code)

## Project Overview

This repository contains Java code that illustrates how SOLID principles can be applied to improve the design and maintainability of a food ordering system. Each principle is demonstrated with both a violation example and a corrected implementation.

## SOLID Principles Demonstrated

### 1. Single Responsibility Principle (SRP)
- **Definition**: A class should have only one reason to change.
- **Violation**: `FoodOrder` class handling order creation, payment processing, and notifications.
- **Solution**: Separate classes for `OrderService`, `PaymentService`, and `NotificationService`.

### 2. Open/Closed Principle (OCP)
- **Definition**: Software entities should be open for extension but closed for modification.
- **Violation**: `DiscountCalculator` class requiring modification for new customer types.
- **Solution**: `DiscountStrategy` interface allowing new discount strategies without modifying existing code.

### 3. Dependency Inversion Principle (DIP)
- **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions.
- **Violation**: `FoodOrderProcessor` directly depending on `EmailNotification`.
- **Solution**: `FoodOrderProcessor` depending on `NotificationService` interface.

## Use Case: Food Ordering System

The project simulates a food ordering system with the following features:
- Creating food orders
- Processing payments
- Sending order notifications
- Calculating discounts based on customer types

This use case demonstrates how SOLID principles can be applied in a real-world scenario to create more flexible and maintainable code.

## Project Structure

```
Addressing_SOLID_Principles/
├── README.md
├── Violated/
│   ├── SRP/
│   ├── OCP/
│   └── DIP/
└── Solved/
    ├── SRP/
    ├── OCP/
    └── DIP/
```

Each principle folder contains relevant Java files demonstrating the principle's violation and solution.

## How to Run the Code

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/Addressing_SOLID_Principles.git
   ```

2. Navigate to a specific principle's folder:
   ```
   cd Addressing_SOLID_Principles/Solved/SRP
   ```

3. Compile and run the Java files:
   ```
   javac *.java
   java Main
   ```

4. Repeat for other principles (OCP, DIP) to see their implementations.

By exploring this project, you'll gain insights into how SOLID principles can be applied to create more robust, flexible, and maintainable software designs.
