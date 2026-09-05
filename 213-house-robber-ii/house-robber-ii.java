class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int n=nums.length;

        return Math.max(helper(0,n-2,nums),helper(1,n-1,nums));
    }
    public int helper(int st,int end,int[] nums){
        int[] a=new int[nums.length-1];
        a[0]=nums[st];
        a[1]=Math.max(nums[st],nums[st+1]);
        for(int i=st+2, j=2; i<=end ;i++, j++){
            a[j]=Math.max(a[j-1],a[j -2]+nums[i]);
        }
        return a[nums.length-2];
    }
}