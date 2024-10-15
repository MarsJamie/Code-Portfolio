package com.proj1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza implements Comparable<Pizza> {
    
    public enum CrustType {
        Plain, Butter, Garlic, GarlicButter, Cheese
    }
    
    public enum SizeType {
        Small, Medium, Large, XLarge, XXLarge, Party
    }
    
    private CrustType crust;
    private ArrayList<String> toppings;
    private SizeType size;
    
    private static final ArrayList<String> VALID_TOPPINGS = new ArrayList<>(Arrays.asList(
        "cheese", "onion", "green pepper", "ham", "pineapple", "pepperoni", "ground beef", "Italian sausage", "anchovies"
    ));

    // Default constructor
    public Pizza() {
        this.crust = CrustType.Plain;
        this.toppings = new ArrayList<>();
        this.size = SizeType.Small;
    }
    
    // Parameterized constructor
    public Pizza(CrustType crust, ArrayList<String> toppings, SizeType size) {
        this.crust = crust;
        this.toppings = new ArrayList<>();
        for (String topping : toppings) {
            if (VALID_TOPPINGS.contains(topping.toLowerCase())) {
                this.toppings.add(topping.toLowerCase());
            }
        }
        this.size = size;
    }
    
    // Getter and setter methods
    public CrustType getCrust() {
        return crust;
    }
    
    public void setCrust(CrustType crust) {
        this.crust = crust;
    }
    
    public ArrayList<String> getToppings() {
        return new ArrayList<>(toppings);
    }
    
    public void setToppings(ArrayList<String> toppings) {
        this.toppings = new ArrayList<>();
        for (String topping : toppings) {
            if (VALID_TOPPINGS.contains(topping.toLowerCase())) {
                this.toppings.add(topping.toLowerCase());
            }
        }
    }
    
    public SizeType getSize() {
        return size;
    }
    
    public void setSize(SizeType size) {
        this.size = size;
    }
    
    // Add topping method
    public void addTopping(String topping) {
        if (VALID_TOPPINGS.contains(topping.toLowerCase())) {
            toppings.add(topping.toLowerCase());
        }
    }
    
    // Override toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This pizza has a ").append(crust).append(" crust and the following toppings: ");
        if (toppings.isEmpty()) {
            sb.append("none");
        } else {
            sb.append(String.join(" ", toppings));
        }
        return sb.toString();
    }
    
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pizza other = (Pizza) obj;
        return crust == other.crust && toppings.size() == other.toppings.size();
    }
    
    // Implement compareTo method
    @Override
    public int compareTo(Pizza otherPizza) {
        if (this.toppings.size() < otherPizza.toppings.size()) {
            return -1;
        } else if (this.toppings.size() > otherPizza.toppings.size()) {
            return 1;
        } else {
            return Integer.compare(this.crust.ordinal(), otherPizza.crust.ordinal());
        }
    }
}
