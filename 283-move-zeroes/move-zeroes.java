class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return;
        }
        int l=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[l]=nums[i];
                l++;
            }
            else{
                count++;
            }
        }
        int n=nums.length;
        for(int i=n-1;i>n-count-1;i--){
            nums[i]=0;
        }
        return;
    }
}