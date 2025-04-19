class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                int temp=nums[i];
                res^=temp;
            }
        }
        return res;
    }
}