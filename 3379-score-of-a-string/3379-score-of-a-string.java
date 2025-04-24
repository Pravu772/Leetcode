class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int sub=0;
        for(int i=0;i<s.length()-1;i++){
            sub=Math.abs(s.charAt(i)-s.charAt(i+1));
            sum+=sub;
        }
        return sum;
    }
}