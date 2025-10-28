class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newIntervals = new int[intervals.length +1][2];//create new space
        for(int i=0;i<intervals.length;i++){
            newIntervals[i] = intervals[i];
        }
        newIntervals[intervals.length]=newInterval;
        Arrays.sort(newIntervals,(a,b)-> Integer.compare(a[0],b[0]));//[[1,3],[2,6]...]thrn a[0]=1 and b[0]=2
        List<int[]> merged=new ArrayList<>();
        int[] current=newIntervals[0];
        merged.add(current);
        for(int[] interval:newIntervals){
            int currentend=current[1];
            int nextstart=interval[0];//cause [[1,3] and [1,3]] will give 1,3 so ita unnnecessary case for first iteration
            int nextend=interval[1];
            if(currentend>=nextstart){
                current[1]=Math.max(currentend, nextend);
            }else{
                current=interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}