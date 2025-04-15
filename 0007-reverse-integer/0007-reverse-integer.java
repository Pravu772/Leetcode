class Solution {
public int reverse(int x) {
    long total=0,rem=0;
    while(x!=0){
        rem=x%10;
        total = total*10+rem;
        x=x/10;
        }
        if(total>Integer.MAX_VALUE || total<Integer.MIN_VALUE)
        return 0;

            return (int)total;
            
}
}