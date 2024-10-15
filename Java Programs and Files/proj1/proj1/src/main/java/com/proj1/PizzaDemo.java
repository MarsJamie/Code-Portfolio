package com.proj1;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaDemo {
    public static void main(String[] args) {
        // Create some Pizza objects
        Pizza pizza1 = new Pizza();
        pizza1.addTopping("cheese");
        pizza1.addTopping("pepperoni");
        
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList("cheese", "ham", "pineapple"));
        Pizza pizza2 = new Pizza(Pizza.CrustType.Butter, toppings, Pizza.SizeType.Medium);
        
        Pizza pizza3 = new Pizza(Pizza.CrustType.Cheese, new ArrayList<>(), Pizza.SizeType.Large);
        
        // Test toString method
        System.out.println("Pizza 1: " + pizza1);
        System.out.println("Pizza 2: " + pizza2);
        System.out.println("Pizza 3: " + pizza3);
        
        // Test equals method
        System.out.println("\nPizza 1 equals Pizza 2: " + pizza1.equals(pizza2));
        System.out.println("Pizza 1 equals Pizza 3: " + pizza1.equals(pizza3));
        
        // Test compareTo method
        System.out.println("\nPizza 1 compareTo Pizza 2: " + pizza1.compareTo(pizza2));
        System.out.println("Pizza 2 compareTo Pizza 3: " + pizza2.compareTo(pizza3));
        System.out.println("Pizza 3 compareTo Pizza 1: " + pizza3.compareTo(pizza1));
    }
}


