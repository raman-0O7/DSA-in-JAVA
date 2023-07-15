public class MinimumSwapsForBalanceBrackets {
    public static void main(String[] args) {
        String brackets = "[[][]]";
        int i = 0, countL = 0, countR = 0, swap = 0, imbalance = 0;
        while(i < brackets.length()) {
            if(brackets.charAt(i) == '[') {
                countL++;
            } else countR++;
            if(imbalance > 0) {
                swap += imbalance;
//                imbalance--;
            }
            imbalance = countR - countL;
            i++;
        }
        System.out.println(swap);
    }
}
