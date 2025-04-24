class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftpointer=0;
        int rightpointer=numbers.length-1;
        while(leftpointer!=rightpointer){
            int twosum=numbers[leftpointer]+numbers[rightpointer];
            if(twosum==target){
                return new int []{leftpointer+1,rightpointer+1};
            }
            else if(twosum>target){
                rightpointer--;
            }
            else{
                leftpointer++;
            }
        }
        return new int[] {};
    }
}