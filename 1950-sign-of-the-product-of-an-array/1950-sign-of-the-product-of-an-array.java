class Solution {
    public int arraySign(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                m++;
            }            
        }
            if(m%2!=0){
                return -1;
            }
        return 1;
    }
}