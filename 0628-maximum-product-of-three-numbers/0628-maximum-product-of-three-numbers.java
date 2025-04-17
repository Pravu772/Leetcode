class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int pos_num= nums[n-1]*nums[n-2]*nums[n-3];
        int neg_num= nums[0]*nums[1]*nums[n-1];
        return Math.max(pos_num,neg_num);
    }
}