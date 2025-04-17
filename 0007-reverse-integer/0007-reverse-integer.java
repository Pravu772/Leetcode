class Solution {
public int reverse(int x) {
    int total=0,rem=0;
    while(x!=0){
        if(total>Integer.MAX_VALUE/10 || total<Integer.MIN_VALUE/10) return 0;
        rem=x%10;
        total = total*10+rem;
        x=x/10;
        }

            return (int)total;
            
}
}