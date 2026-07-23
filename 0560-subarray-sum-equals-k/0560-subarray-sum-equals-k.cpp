class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map <int, int> preSumMap;

        preSumMap[0] = 1;  
        int prefix = 0;
        int count = 0;

        for (int i = 0; i < nums.size(); i++){
            prefix += nums[i];
            // if (prefix == k){
            //     count++;
            // }

            int rem = prefix - k;
            if (preSumMap.find(rem) != preSumMap.end()){
                count += preSumMap[rem];
            }
            preSumMap[prefix]++;
        }
        return count;
    }
};