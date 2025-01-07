package Stocks_Buy_and_Sell;

class optimal {
  public static void main(String[] args) {
    int prices[] = {7, 1, 5, 3, 6, 4};
    
    int min = prices[0];
    int maxProfit = 0;
    int n = prices.length;

    for(int i=0; i<n; i++){
      int cost = prices[i] - min;
      maxProfit = Math.max(maxProfit, cost);
      min = Math.min(min, prices[i]);
    }

    System.out.println("Max Profit: "+ maxProfit);
  }  
}
