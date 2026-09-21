class Solution {
    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (end < s.length()) {

            char ch = s.charAt(end);

            if (!set.contains(ch)) {

                set.add(ch);
                end++;

                max = Math.max(max, end - start);

            } else {

                set.remove(s.charAt(start));
                start++;
            }
        }

        return max;
    }
}