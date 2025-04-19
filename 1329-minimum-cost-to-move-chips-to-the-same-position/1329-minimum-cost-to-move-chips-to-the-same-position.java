class Solution {
    public int minCostToMoveChips(int[] position) {
        int c1=0;
        int c2=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                c1++;
            }
            else{
                c2++;
            }
        }
        return Math.min(c1,c2);
    }
}