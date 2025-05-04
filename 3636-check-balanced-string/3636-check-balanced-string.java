class Solution {
    public boolean isBalanced(String num) {
        int[] n=new int[num.length()];
        for(int i=0;i<n.length;i++){
            n[i]=num.charAt(i)-'0';
        }
        int sum=0;
        int sum1=0;
        for(int i=0;i<n.length;i+=2){
            sum+=n[i];
        }
        for(int i=1;i<n.length;i+=2){
            sum1+=n[i];
        }
        return (sum==sum1)?true:false;
    }
}