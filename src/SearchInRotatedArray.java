import static java.util.Arrays.binarySearch;

public class SearchInRotatedArray {
    int helper(int[] A, int l, int h, int key) {
        if(h < l) return -1;

        int pivot = findPivot(A, l, h);
        if(pivot == -1) return binarySearch(A, l, h, key);
        if(A[pivot] == key) return pivot;
        else if(A[l] <= key) return binarySearch(A, l, pivot-1, key);
        else return binarySearch(A, pivot+1, h, key);
    }

    private int findPivot(int[] a, int l, int h) {
        if(h < l) return -1;

        int m = l + (h - l)/2;
        if(a[m] > a[m + 1]) return m;
        else if(a[m-1] > a[m]) return m - 1;
        else if(a[m] < a[m+1]) return findPivot(a, m+1, h);
        else return findPivot(a, m-1, h);
    }


    int search(int[] A, int key) {

        return helper(A, 0, A.length-1, key);
    }
    public static void main(String[] args) {
        int[] A = {5,6,7,8,9,10,1,2,3};
        SearchInRotatedArray s = new SearchInRotatedArray();
        System.out.println(s.search(A, 10));
    }
}
