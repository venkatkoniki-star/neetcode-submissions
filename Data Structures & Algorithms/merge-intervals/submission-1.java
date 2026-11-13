class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        ArrayList<int[]> mergeInt = new ArrayList<>();
        for(int i =0;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            
            for(int j = i+1;j<intervals.length;j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end,intervals[j][1]);
                    i = j;
                }else{
                    break;
                }
            }
            mergeInt.add(new int[]{start,end});
        }

        return mergeInt.toArray( new int[mergeInt.size()][]);
        
    }
}
