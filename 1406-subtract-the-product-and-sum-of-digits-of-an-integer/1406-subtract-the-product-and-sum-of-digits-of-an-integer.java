class Solution {
    public int subtractProductAndSum(int n) {
        int m=1;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            m*=dig;
            n/=10;
        }
        return m-sum;
    }
}