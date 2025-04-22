class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxgap=0;
        for(int i=1;i<nums.length;i++){
            int gap=nums[i]-nums[i-1];
            maxgap=Math.max(maxgap,gap);
        }
        return maxgap;
    }
}