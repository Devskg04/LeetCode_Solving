class Solution {
    public int pivotIndex(int[] nums) {
            int right=0;
            for(int i=0;i<nums.length;i++){
                right=right+nums[i];
            }
            int left=0;
            for(int i=0;i<nums.length;i++){
                right=right-nums[i];
                System.out.println(left+" "+right);
                
                if(left==right){
                    return i;
                }
                left=left+nums[i];

            }
            return -1;
    }
}