class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int ele:nums){
            currSum = Math.max(ele, currSum+ele);
            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum;
    }
}
