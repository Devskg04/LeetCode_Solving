class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%nums.length;
        if(n==1){
            return;
        }
        reverse(0,n-k-1,nums);
        reverse(n-k,n-1,nums);
        reverse(0,n-1,nums);
        return ;
    }

    public void reverse(int start,int end,int[] nums){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--; 
        }
        return ;
    }
}