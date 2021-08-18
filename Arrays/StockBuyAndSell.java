package Array.high;

public class StockBuyAndSell {

	public static void main(String[] args) {
		//int price[] = {7,1,5,3,6,4};
		int price[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
		System.out.println(findStockBuySellProfit(price));
	}

	private static int findStockBuySellProfit(int[] price) {
		
		int lowestPrice = price[0];
		int maxProfit =0;
		int cost = 0;
		int lowIndexPosition =0;
		int maxIndexPosition = 0;
		
		for(int i =0; i<price.length; i++) {
			if(price[i] > lowestPrice) {				
				cost = price[i] - lowestPrice;
				if(cost>maxProfit) {
					maxProfit = cost;
					maxIndexPosition = i;
					System.out.println("maxIndexPosition :: "+maxIndexPosition);
				}
			}else if(price[i] < lowestPrice) {
				lowestPrice = price[i];
				lowIndexPosition = i;
			    System.out.println("lowestPrice :: "+lowestPrice);
			    System.out.println("lowIndexPosition :: "+lowIndexPosition);
			}
		}
		//System.out.println(" Day max profit "+price[maxProfit]);
		return maxProfit;		
	}
}
