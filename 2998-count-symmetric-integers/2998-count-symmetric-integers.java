class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <=high; i++) {
            String s = Integer.toString(i);
            int len = s.length();
            if (len % 2 != 0) {
                continue;
            }

                int half = len / 2;
                int leftSum = 0;
                int rightSum = 0;
            
            for (int j = 0; j < half; j++) {
                leftSum += s.charAt(j) - '0';
            }
            for (int k = half; k < len; k++) {
                rightSum += s.charAt(k) - '0';
            }
            if (leftSum == rightSum) {
                count++;
            }
            
        }

        return count;

    }
}