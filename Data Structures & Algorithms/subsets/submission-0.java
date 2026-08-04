class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subList = new ArrayList<>();

        sequences(0,nums,list,subList);
        return subList;
    }
    public void sequences(int index,int[] nums,List<Integer> list,List<List<Integer>> subList){
        if(index >= nums.length){
            subList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        sequences(index+1,nums,list,subList);
        list.remove(list.size()-1);
        sequences(index+1,nums,list,subList);
    }
}
