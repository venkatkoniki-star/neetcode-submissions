class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];

            
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int count1 = robber(nums,0,n-2,dp1);
        int count2 = robber(nums,1,n-1,dp2);
        return Math.max(count1,count2);
    }
    public int robber(int[] nums,int start,int end,int[] dp){
        if(start > end){
            return 0;
        }
        if(dp[start] != -1){
            return dp[start];
        }
        int take = nums[start]+robber(nums,start+2,end,dp);
        int skip = robber(nums,start+1,end,dp);
        
        return  dp[start] = Math.max(take,skip);
    }
}
