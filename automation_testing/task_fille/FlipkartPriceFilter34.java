package task.assignment6;

public class FlipkartPriceFilter34 
{
	 public static void main(String[] args) {

	        // Product prices array
	        int[] prices = {499, 1200, 999, 350, 1500, 750, 1050, 200};
	        int budget = 1000;
	        int i = 0;

	        System.out.println("---- Products Under ₹" + budget + " ----");

	        // while loop to filter prices
	        while (i < prices.length) {
	            if (prices[i] <= budget) {
	                System.out.println("₹" + prices[i]);
	            }
	            i++;
	        }

	        System.out.println("----------------------------");
	    }

}
