public class AssignmentGreedy1 {
    public static void main(String[] args) {
        int[] a = {1,2,-3};
        int[] b = {-2,3,-5};
        int k = 5;

        //Find max element in array b
        int maxele = Integer.MIN_VALUE;
        
        for(int i=0; i<b.length; i++) {
            if(maxele > b[i]) maxele = b[i];
        }

    }
}
