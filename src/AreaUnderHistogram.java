import java.util.Arrays;
import java.util.Stack;

public class AreaUnderHistogram {
    static void nextSmaller(int[] heights, int[] nextSmaller, Stack<Integer> st) {
        st.push(0);
        for(int i =1; i < heights.length; i++) {
            while(!st.empty() && heights[st.peek()] >= heights[i]) {
                nextSmaller[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.empty()) {
            nextSmaller[st.pop()] = heights.length;
        }
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int[] prevSmaller = new int[heights.length];
        int[] nextSmaller = new int[heights.length];
        int[] width = new int[heights.length];

//        Stack<Integer> st = new Stack<>();
        //Next Smaller Elements
        nextSmaller(heights, nextSmaller, new Stack<>());

        //Previous Smaller elements
        previousSmaller(heights, prevSmaller, new Stack<>());

        //calculating width
        for(int i = 0; i < heights.length; i++) {
            width[i] = nextSmaller[i] - prevSmaller[i] - 1;
        }

        for(int i = 0; i < heights.length; i++) {
            heights[i] *= width[i];
        }
//        System.out.println(Arrays.toString(heights));
        int ans = 0;
        for(int ele : heights) {
            ans = Math.max(ans, ele);
        }
        System.out.println(ans);


    }

    private static void previousSmaller(int[] heights, int[] prevSmaller, Stack<Integer> st) {
        int i =0, j= heights.length -1;
        while(i <= j) {
            int temp = heights[i];
            heights[i] = heights[j];
            heights[j] = temp;
            i++;
            j--;
        }
        st.push(0);
        for(i =1; i < heights.length; i++) {
            while(!st.empty() && heights[st.peek()] >= heights[i]) {
                prevSmaller[st.pop()] = heights.length - i - 1;
            }
            st.push(i);
        }
        while(!st.empty()) {
            prevSmaller[st.pop()] = -1;
        }
        i=0; j = heights.length -1 ;
        while(i <= j) {
            int temp = heights[i];
            heights[i] = heights[j];
            heights[j] = temp;
            i++;
            j--;
        }
        i=0; j = heights.length - 1;
        while(i <= j) {
            int temp = prevSmaller[i];
            prevSmaller[i] = prevSmaller[j];
            prevSmaller[j] = temp;
            i++;
            j--;
        }
    }
}
