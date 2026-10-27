
class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];

        StringBuilder first = new StringBuilder();
        for (int j = 0; j < n; j++) {
            first.append('.');
        }
        ans[0] = first.toString();

        StringBuilder other = new StringBuilder();
        for (int j = 0; j < n - 1; j++) {
            other.append('#');
        }
        other.append('.');

        for (int i = 1; i < m; i++) {
            ans[i] = other.toString();
        }

        return ans;
    }
}
