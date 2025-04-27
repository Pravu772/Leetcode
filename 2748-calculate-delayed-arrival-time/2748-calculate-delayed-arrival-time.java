class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int p=arrivalTime+delayedTime;
        return p%24;
    }
}