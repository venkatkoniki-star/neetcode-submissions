class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] preMax = new int[n];
        preMax[0] = height[0];
        for(int i =1;i<n;i++){
            preMax[i] = Math.max(preMax[i-1], height[i]);
        }
        int[] sufMax = new int[n];
        sufMax[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            sufMax[i] = Math.max(sufMax[i+1], height[i]);
        }
        int total =0;
        for(int i=0;i<n;i++){
            int leftMax = preMax[i],rightMax = sufMax[i];
            if(height[i] < leftMax && height[i]<rightMax){
                total+=Math.min(leftMax,rightMax) - height[i];
            }
        }
        return total;
    }
}
