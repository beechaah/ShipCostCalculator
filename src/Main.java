public class Main
{
    public static void main(String[] args)
    {
        double FREE_SHIP_VALUE = 100;
        double SHIP_RATE = 0.02;
        double itemPrice = 125.67;
        double totalPrice = 0;
        double shipCost = 0;
        double totalCost = 0;
        boolean doneInput = false;
        String continueYN = "";
        do
        {
            System.out.println("Enter the price of the item: ");
            totalPrice += itemPrice;
            System.out.println("Do you have another item? (Y/N): ");
            if (continueYN == "N")
            {
                doneInput = true;
            }

        }
        while (doneInput == true);
        if (totalPrice >= FREE_SHIP_VALUE)
        {
            shipCost = 0;
            totalCost = totalPrice;
        }
        else
        {
            shipCost = totalPrice * SHIP_RATE;
            totalCost = totalPrice + shipCost;
        }
        System.out.println("The total price is: " + totalPrice);
        System.out.println("The Shipping Costs are: " + shipCost);
        System.out.println("The total costs are: " + totalCost);
    }
}