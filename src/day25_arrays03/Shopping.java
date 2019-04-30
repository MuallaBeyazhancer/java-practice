package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {

		String[] product = { "Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks" };
		double[] prices = { 120.0, 5.99, 150.50, 3000.5, 6.99 };
		int[] itemsId = { 12345, 12346, 12347, 12348, 12349 };

		// print count of products
		// loop through products and print each one in seperate line
		System.out.println("Products count: " + product.length);
		if (product.length == prices.length && product.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong in the list");
			return;
		}
		for (String list : product) {
			System.out.println(list);
		}
		// prices --> for
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
			// itemsId print this in reverse order

		}
		for (int i = itemsId.length - 1; i >= 0; i--) {

			System.out.println(itemsId[i]);
		}
		//print a report. with a total price
		// item1: Timberland Shoes - $120.0
		//...
		//Total price
		
		System.out.println("##### YOUR SHOPPING RECEIPT #####");
		
		double totalPrice = 0.0;
		for(int i = 0; i < product.length; i++) {
			System.out.println("Item "+(i+1)+": "+itemsId[i]+" - "+ product[i]+ " - $"+ prices[i] );
			totalPrice += prices[i];
			
		}
		
		System.out.println("Total Price: $"+ totalPrice);
		int maxIndex = 0;
		double maxPrice = 0.0;
		// find the most expensive item and print
		for(int i = 0; i< prices.length; i++) {
			if(prices[i] > maxPrice) {
				maxPrice = prices[i];
				maxIndex = i;
				
			}
		}
		System.out.println(itemsId[maxIndex]+ " - "+ product[maxIndex]+" - $"+maxPrice);
		int minIndex = 0;
		double minPrice = prices[0];
		for(int i = 0; i<prices.length; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
				minIndex = i;
			}
		}
		System.out.println(itemsId[minIndex]+ " - "+ product[minIndex]+" - $"+minPrice);
		
	}

}
