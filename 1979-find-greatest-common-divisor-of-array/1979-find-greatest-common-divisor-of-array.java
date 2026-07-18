class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small=nums[0];
        int large = nums[nums.length-1];

        int div=0;
        for(int i=large;i>=2;i--)
        {
            if(small%i==0 && large%i==0)
            {
                div=i;
                break;
            }
        }
        if(div!=0)
        {
            return div;
        }
        else
        {
            return 1;
        }
    }
}