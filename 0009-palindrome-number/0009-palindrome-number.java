class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int palNum = 0;
        int num = x;
        while (num != 0){
            int digit = num % 10;
            palNum = palNum * 10 + digit;
            num /= 10;
        }

        return x == palNum;
    }
}