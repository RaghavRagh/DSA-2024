// 3
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0; int right = 0;
        int len = 0;

        while(right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }

            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
