public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,2,2,1,3};

        System.out.println("Majority element in the given array is: "+ findMajorityElement(arr));
    }

    private static int findMajorityElement(int[] arr) {
        int majorityEle = arr[0];
        int majorityCount = 1;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] != majorityEle) {
                majorityCount--;
                if (majorityCount == 0) {
                    majorityEle = arr[i];
                    majorityCount = 1;
                }
            }else majorityCount++;
        }
        return majorityEle;
    }


}
