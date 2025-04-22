class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=2;j<=n;j++){
                for(int k=3;k<=n;k++){
                    double a=(int) Math.pow(i,2);
                    double b=(int) Math.pow(j,2);
                    double c=(int) Math.pow(k,2);
                    if((a+b)==c){
                        count++;
                    }
                
                }              
                
            }
        }
        return count;
    }
}