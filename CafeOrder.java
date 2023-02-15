// Write a program where you create 3 variables that represent products
// at a cafe. The products could be beverages like coffee, cappuccino,
// espresso, green tea, etc. Assign prices to each product. Create 2 more
// variables called subtotal and totalSale and complete an “order” for 3
// items of the first product, 4 items of the second product, and 2 items of
// the third product. Add them all together to calculate the subtotal.
//  Create a constant called SALES_TAX and add sales tax to the subtotal
//  to obtain the totalSale amount. Be sure to format the results to 2 decimal
 


import java.text.DecimalFormat;

public class CafeOrder {
    public static void main(String[] args) {
        
        // Define product prices
        double coffeePrice = 2.99;
        double cappuccinoPrice = 3.99;
        double espressoPrice = 2.49;
        
        // Define order quantities
        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int espressoQty = 2;
        
        // Calculate subtotal
        double subtotal = (coffeePrice * coffeeQty) + (cappuccinoPrice * cappuccinoQty) + (espressoPrice * espressoQty);
        
        // Add sales tax
        final double SALES_TAX = 0.07; // 7% sales tax
        double totalSale = subtotal * (1 + SALES_TAX);
        
        // Format results to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedSubtotal = df.format(subtotal);
        String formattedTotalSale = df.format(totalSale);
        
        // Output results
        System.out.println("Order Summary:");
        System.out.println("--------------");
        System.out.println(coffeeQty + " x Coffee @ $" + coffeePrice + " = $" + (coffeePrice * coffeeQty));
        System.out.println(cappuccinoQty + " x Cappuccino @ $" + cappuccinoPrice + " = $" + (cappuccinoPrice * cappuccinoQty));
        System.out.println(espressoQty + " x Espresso @ $" + espressoPrice + " = $" + (espressoPrice * espressoQty));
        System.out.println("Subtotal: $" + formattedSubtotal);
        System.out.println("Sales Tax (" + (SALES_TAX * 100) + "%): $" + df.format(subtotal * SALES_TAX));
        System.out.println("Total Sale: $" + formattedTotalSale);
    }
}

