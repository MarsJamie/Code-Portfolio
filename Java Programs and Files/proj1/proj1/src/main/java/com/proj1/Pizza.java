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


