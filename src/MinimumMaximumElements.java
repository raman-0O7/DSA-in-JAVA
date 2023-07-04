public class MinimumMaximumElements {
    static class Pair {
        int min;
        int max;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,7,2,9};

        Pair minmax = new Pair();
        minmax = findMinMax(arr,0, arr.length-1);
        System.out.println("the minimum and maximum element in array are "+ minmax.min +" "+  minmax.max);
    }

    private static Pair findMinMax(int[] arr, int l, int h) {
        Pair minmax = new Pair();
        Pair minmaxL = new Pair();
        Pair minmaxR = new Pair();

        if(l == h) {
            minmax.min = arr[l];
            minmax.max = arr[l];
            return minmax;
        }
        else if(l == h-1) {
            if(arr[l] < arr[h]) {
                minmax.min = arr[l];
                minmax.max = arr[h];
            }
            else{
                minmax.min = arr[h];
                minmax.max = arr[l];

            }
            return minmax;
        }
        else {
            int mid = l + (h-l)/2;
            minmaxL = findMinMax(arr, l, mid);
            minmaxR = findMinMax(arr, mid+1, h);

            if(minmaxL.min < minmaxR.min) minmax.min = minmaxL.min;
            else minmax.min = minmaxR.min;

            if(minmaxL.max > minmaxR.max) minmax.max = minmaxL.max;
            else minmax.max = minmaxR.max;
        }
        return minmax;
    }
}
