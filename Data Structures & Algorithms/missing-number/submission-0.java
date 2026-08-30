class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int actualSum = n*(n+1)/2;
        for(int ele :nums){
            sum+=ele;
        }
        return actualSum-sum;
    }
}