import java.util.Arrays;

public class DistributionAccRating {
    public static void main(String[] args) {
        int[] rating = {1,5,2,1};

        System.out.println(totalCandiesOptimized(rating));
    }

    private static int totalCandiesOptimized(int[] rating) {
        int[] ans = new int[rating.length];
        Arrays.fill(ans, 1);
        for(int i=1; i<ans.length; i++) {
            if(rating[i] > rating[i-1]) ans[i]++;
        }
        for(int i=ans.length-2; i>=0; i--) {
            if(rating[i] > rating[i+1] && ans[i] <= ans[i+1]) ans[i]= ans[i+1] + 1;
        }
        int total = 0;
        for (int i:
             ans) {
            total += i;
        }
        return total;
    }

//    //Brute Force approach
//    private static int totalCandies(int[] rating) {
//        Arrays.sort(rating);
//        int candy = 1;
//        int totalCandies = 1;
//        for(int i=1; i<rating.length; i++){
//            if(rating[i] > rating[i-1]) candy++;
//            totalCandies += candy;
//        }
//        return totalCandies;
//    }
}
