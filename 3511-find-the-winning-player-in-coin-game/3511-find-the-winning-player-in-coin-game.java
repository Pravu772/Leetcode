class Solution {
    public String winningPlayer(int x, int y) {
        double p=(int)Math.min(x,y/4);
        if(p%2==0){
            return "Bob";
        }
        return "Alice";
    }
}