class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set < Character> duplicate = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++){
            while (duplicate.contains(s.charAt(right))) {
                duplicate.remove(s.charAt(left));
                left++;
            }
            duplicate.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }

}