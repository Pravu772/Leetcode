class Solution {
    public char repeatedCharacter(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)<i){
                return c;
            }
        }
        return ' ';
    }
}