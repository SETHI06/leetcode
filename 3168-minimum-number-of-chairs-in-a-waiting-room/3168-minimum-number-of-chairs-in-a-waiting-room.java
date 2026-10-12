class Solution {
    public int minimumChairs(String s) {
        int chair = 0;
        int max = Integer.MIN_VALUE;
        for (char ch : s.toCharArray()) {
            if (ch == 'E') {
                chair++;
            } else {
                chair--;
            }
            max = Math.max(chair, max);
        }
        return max;
    }
}