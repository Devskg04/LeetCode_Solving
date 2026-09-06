class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1 || cost.length==2){
            return Math.min(cost[0],cost[1]);
        }
        int n=cost.length;
        int[] a= new int[n];
        a[0]=cost[0];
        a[1]=cost[1];
        for(int i=2;i<n;i++){
            a[i]=Math.min(a[i-1],a[i-2])+cost[i];
        }   
        return Math.min(a[n-1],a[n-2]);
    }
}