class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        if(n==1 || n==2){
            return n;
        }
        Arrays.fill(arr,-1);
        arr[1]=1;
        arr[2]=2;
        return dpClimb(n,arr);
    }
    public int dpClimb(int n,int arr[]){
        if(arr[n]!=-1){
            return arr[n];
        }
        
        return arr[n]=dpClimb(n-1,arr)+dpClimb(n-2,arr);
    }
}