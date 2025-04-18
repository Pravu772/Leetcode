class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int c=x^y;
        while(c>0){
            if(c%2==1){
                count++;
            }
            c/=2;
        }
        return count;
    }
}