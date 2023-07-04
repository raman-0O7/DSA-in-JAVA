import java.util.HashMap;

public class LeetCode2 {
    public static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, n = s.length(), ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (; r < n; r++) {
            map.put(s.charAt(r), 1);
            for (; map.get(s.charAt(r)) > 1; l++) {
                int value = map.get(s.charAt(l));
                map.remove(s.charAt(l));
                map.put(s.charAt(l), value--);
            }

                ans = Math.max(ans, r - l + 1);
            }
            return ans;
        }
    public static void main (String[] args) {
        String s = "abcabc";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

