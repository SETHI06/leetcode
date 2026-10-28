
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        StringBuilder[] bucket = new StringBuilder[s.length() + 1];

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                int count = freq[i];

                if (bucket[count] == null) {
                    bucket[count] = new StringBuilder();
                }

                for (int j = 0; j < count; j++) {
                    bucket[count].append((char) i);
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = s.length(); i >= 1; i--) {
            if (bucket[i] != null) {
                result.append(bucket[i]);
            }
        }

        return result.toString();
    }
}
