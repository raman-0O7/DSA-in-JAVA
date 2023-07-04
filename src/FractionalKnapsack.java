import java.util.*;

public class FractionalKnapsack {
    static class Items {
        int profit;
        int weight;
        Items(int profit, int weight) {
            this.profit = profit;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        Items[] arr = {new Items(25,5), new Items(75, 10), new Items(100, 12), new Items(50,4), new Items(45, 7), new Items(90, 9), new Items(30,3)};
        System.out.println(getMaxProfit(arr, arr.length, 37));

    }

    private static double getMaxProfit(Items[] arr, int length, int capapcity) {

        Arrays.sort(arr, new Comparator<Items>() {
            @Override
            public int compare(Items i1, Items i2) {
                double d1 = Double.valueOf(i1.profit/ i1.weight);
                double d2 = Double.valueOf(i2.profit/i2.weight);

                if (d1 < d2) return 1;
                else return -1;
            }
        });

        double totalProfit = 0;

        for(Items i : arr) {
            if(capapcity > 0){
                if(capapcity >= i.weight) {
                    capapcity -= i.weight;
                    totalProfit += i.profit;
                }
                else {
                    double fraction = (double) capapcity/i.weight;
                    totalProfit += (double)i.profit*fraction;
                    break;
                }
            }
        }
        return totalProfit;
    }
}
