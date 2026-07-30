

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        return robber(nums,0,dp);
    }
    public int robber(int[] nums,int index,int[] dp){
        if(index > nums.length-1){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int take = nums[index]+robber(nums,index + 2,dp);

        int skip = robber(nums,index+1,dp);

        return dp[index] = Math.max(take,skip);
    }
}
