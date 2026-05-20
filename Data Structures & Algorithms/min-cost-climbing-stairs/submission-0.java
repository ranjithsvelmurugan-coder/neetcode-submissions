class Solution {
    int [] arr ;
    public int min(int[] cost,int i){
        if(i >= cost.length){
            return 0;
        }
        if(arr[i] != -1){
            return arr[i];
        }
        return arr[i] = cost[i]+Math.min(min(cost,i+1),min(cost,i+2));
    }
    public int minCostClimbingStairs(int[] cost) {
        arr = new int[cost.length+1];
        Arrays.fill(arr,-1);
        return Math.min(min(cost,0),min(cost,1));
    }
}
