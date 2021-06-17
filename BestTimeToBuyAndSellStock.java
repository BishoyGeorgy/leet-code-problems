public class BestTimeToBuyAndSellStock {
  
  public int maxProfit(int[] prices) {
      int maxProfit = 0;      
      
      /*
       * {7,1,5,8,4,12}
       * maxProfit = 0
       * loop from i = 0 --> i = 4
       * i = 0 --> 7 < 1 ? --> no
       * i = 1 --> 1 < 5 ? --> yes ==> maxProfit = 0 + (5 - 1) = 4
       * i = 2 --> 5 < 8 ? --> yes ==> maxProfit = 4 + (8 - 5) = 7
       * i = 3 --> 8 < 4 ? --> no
       * i = 4 --> 4 < 12 ? --> yes ==> maxProfit = 7 + (12 - 4) = 15
       */
      for (int i = 0; i < prices.length - 1; i++) {
          if (prices[i] < prices[i + 1])
              maxProfit += prices[i + 1] - prices[i];
      }
        
      return maxProfit;
    }
}
