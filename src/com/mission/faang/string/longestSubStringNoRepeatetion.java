package com.mission.faang.string;

import java.util.HashMap;
import java.util.Map;

public class longestSubStringNoRepeatetion {
    public static void main(String[] args) {
        String s = "sangyatri";
        System.out.println("Length longest subString in given string "+
                s+" is "+lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
