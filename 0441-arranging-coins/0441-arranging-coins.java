class Solution {
    public int arrangeCoins(int n) {
        int row =0;
        while(row<n){
            row+=1;
            n-=row;
        }
        return row;
    }
}