class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        int n = nums.length - 1;
        for(int i = 0;i<=n;i++){
            sum += nums[i];

            if(sum > maximum){
                maximum = sum;
            }
            
            if (sum<0){
                sum = 0;
            }
        }
        return maximum;
    }
}