class Solution {
    public int minAddToMakeValid(String s) {
        int len = s.length();

        int minAddition = 0;
        int openBrac = 0;

        for (int i = 0; i < len; i++){
            char c = s.charAt(i);
            if (c == '(') {
                openBrac++;
            } else {
                if (openBrac > 0){
                    openBrac--;
                }
                else {
                    minAddition++;
                }
            }
        }
        return minAddition + openBrac;
    }
}