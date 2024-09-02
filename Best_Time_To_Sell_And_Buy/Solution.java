package Best_Time_To_Sell_And_Buy;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        maxProfit(prices);


    }

    public static  int maxProfit(int[] prices) {
        HashMap<Integer,Integer> pricesHash = new HashMap<>();
        int i = 1;
        for(int p : prices){
            pricesHash.put(i++, p);
        }
      //  pricesHash.entrySet()
        //          .stream()
          //        .forEach(integerIntegerEntry -> System.out.println(integerIntegerEntry.getKey() + ": " + integerIntegerEntry.getValue()));

        int maxPrice = pricesHash.get(1);
        int minPrice = pricesHash.get(1);
        int dayBuy = 1;
        int daySell = 1;
        int profit = 0;

        for (Map.Entry<Integer, Integer> price : pricesHash.entrySet()) {
            System.out.println(price.getKey() + ": " + price.getValue());
            if(price.getValue() > maxPrice)
            {
                maxPrice = price.getValue();
                dayBuy = price.getKey();
            }
            if(price.getValue() < minPrice){
                minPrice = price.getValue();
                daySell = price.getKey();
            }
            if(dayBuy > daySell)
             profit += maxPrice - minPrice;

        }



        return profit;

    }
}
