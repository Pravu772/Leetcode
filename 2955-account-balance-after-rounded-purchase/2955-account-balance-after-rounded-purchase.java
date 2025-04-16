class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int p=((purchaseAmount+5)/10)*10;
        return 100-p;
    }
}