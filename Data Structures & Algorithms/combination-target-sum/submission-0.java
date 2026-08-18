class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        sequence(0,nums,0,target);
        return lists;
    }
    public void sequence(int i,int[] nums,int sum,int target){
        if(sum == target) {
            lists.add(new ArrayList<>(list));
            return ;
        }
        if(i>= nums.length || sum > target){
            return ;
        }
        list.add(nums[i]);
        sequence(i,nums,sum+nums[i],target);
        list.remove(list.size()-1);
        sequence(i+1,nums,sum,target);
    }
}
