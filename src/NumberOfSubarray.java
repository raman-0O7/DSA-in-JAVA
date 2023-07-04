import java.util.Arrays;
import java.util.Stack;

public class NumberOfSubarray {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4};
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i =1; i < arr.length; i++) {
            while(!st.empty() && arr[st.peek()] >= arr[i]) {
                arr[st.pop()] = i;
            }

            st.push(i);
        }
        while(!st.empty()) {
            arr[st.pop()] = arr.length;
        }
        int count = 0;
        for(int i = 0; i< arr.length; i++) {
            count += arr[i] - i;
        }
        System.out.println(count);
    }
}
