class Solution {
    public int binaryGap(int n) {
        int prev=-1;
        int max=0;
        int i=0;
        while(n>0){
            if((n&1)==1){
                if(prev==-1){
                    prev=i;
                }
                else{
                    int diff=i-prev;
                    prev=i;
                    if(max<diff){
                        max=diff;
                    }

                }
            }
            i++;
            n>>=1;
        }
        return max;
    }
}