class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int p=arrivalTime+delayedTime;
        if(p>=24){
            return p%24;
        }
        return p;
    }
}