class Solution {
    public boolean squareIsWhite(String coordinates) {
        int firstdig= coordinates.charAt(0) -'a';
        int lastdig= coordinates.charAt(1)-'1';
        return (firstdig+lastdig)%2!=0;
    }
}