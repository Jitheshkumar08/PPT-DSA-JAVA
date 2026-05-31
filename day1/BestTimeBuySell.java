package day1;

/*
Best Time to Buy and Sell Stock
Problem Statement:
Identify the best day to buy and the best day to sell for highest profit from historical stock prices.

Sample Input:
prices = [7, 1, 5, 3, 6, 4]
Buy at 1 and sell at 6.

45, 12, 3, 10, 50
Best time to buy 3 best time to sell 50

-10, -5, -2, -1, 1
Best time to buy -10 best time to sell 1

90, 40, 20, 10, 4
Best time to buy 10 best time to sell 4
*/
public class BestTimeBuySell {
    public static void main(String[] args) {
        // int[] stocks = {7,1,5,3,6,4};
        int[] stocks = {90,40,20,10,4};
        if(stocks.length<2) return;
        int cBuy = stocks[0], cSell = stocks[1];
        int mPro = cSell - cBuy;
        for(int curr=1;curr<stocks.length;curr++){
            int cPro = stocks[curr] - cBuy;
            if(cPro>mPro){
                mPro = cPro;
                cSell = stocks[curr];
            }
            if(stocks[curr]<cBuy) cBuy = stocks[curr];
        }
        System.out.println((cSell-mPro)+" "+cSell);
    }
}
