class Solution {
    public String removeStars(String s) {
         StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.setLength(stack.length() - 1);
            } else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}