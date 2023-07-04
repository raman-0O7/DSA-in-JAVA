public class Main {
    public static void main(String[] args) {
        int []heights = {2,1,5,6,2,3};
        int n = heights.length;
        int prevMin[] = new int[n];
        prevMin[0] = -1;
        k:for(int i =1; i<n;i++){
            for(int j=i-1; j>=0;j--){
                if(heights[i] > heights[j]) {
                    prevMin[i] = j;
                    continue k;
                }
            }
            prevMin[i] = -1;

        }

        int nextMin[] = new int[n];
        r:for(int i =0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(heights[i] > heights[j]) {
                    nextMin[i] = j;
                    continue r;
                }
            }
            nextMin[i] = n;
        }
        for(int i=0; i<n; i++) {
            nextMin[i] = nextMin[i] - prevMin[i] - 1;
        }

        int max = nextMin[0];
        for(int i=1;i<n;i++){
            max = Math.max(max, nextMin[i]);

        }
        System.out.println(max);
    }
}