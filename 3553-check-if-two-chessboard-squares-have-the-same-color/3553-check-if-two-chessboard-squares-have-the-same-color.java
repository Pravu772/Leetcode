class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int firstdig= coordinate1.charAt(0)-'a';
        int lastdig= coordinate1.charAt(1)-'1';
        int firstdig1= coordinate2.charAt(0)-'a';
        int lastdig1= coordinate2.charAt(1)-'1';
        int sum1=(firstdig+lastdig)+(firstdig1+lastdig1);
        return sum1%2==0;
    }
}