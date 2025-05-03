class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left =0;
        int right=nums.length-1;
        int min_value=0;
        while(left<right){
            int maxpair_sum=nums[left]+nums[right];
            min_value=Math.max(min_value,maxpair_sum);
            left++;
            right--;
        }
        return min_value;
    }
}