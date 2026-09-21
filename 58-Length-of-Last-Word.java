class Solution {
    public int lengthOfLastWord(String s) {
          String[] s1 = s.split("\\s+");
       int n = s1.length;
       int lastlen = s1[n-1].length();
       return lastlen;
    }
}