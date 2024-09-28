package com.proj1;
import java.util.ArrayList;

    enum CrustType {
        Plain,
        Butter,
        Garlic,
        GarlicButter,
        Cheese
    }

    enum SizeType{
        Small,
        Medium,
        Large,
        XLarge,
        XXLarge,
        Party
    }


    public class Pizza {

        private CrustType crust;
        private ArrayList<String> toppings;
        private SizeType size;
        
        public Pizza(CrustType crust, ArrayList<String> toppings, SizeType size){
            this.crust = crust;
            this.toppings = toppings;
            this.size = size;
        }
        
        // Getter and Setter for crust
    public CrustType getCrust() {
        return crust;
    }
    
    public void setCrust(CrustType crust) {
        this.crust = crust;
    }
    
    // Getter and Setter for toppings
    public ArrayList<String> getToppings() {
        return toppings;
    }
    
    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
    
    // Getter and Setter for size
    public SizeType getSize() {
        return size;
    }
    
    public void setSize(SizeType size) {
        this.size = size;
    }

    public static void main(String[] args) {

        ArrayList<String> toppings = new ArrayList<String>();
        toppings.add("Cheese");
        toppings.add("Onion");
        toppings.add("Green Pepper");
        toppings.add("Ham");
        toppings.add("Pineapple");
        toppings.add("Pepperoni");
        toppings.add("Ground Beef");
        toppings.add("Italian Sausage");
        toppings.add("Anchovies");

        Pizza pizza = new Pizza(CrustType.Plain, toppings, SizeType.Small);

     }
    
}


