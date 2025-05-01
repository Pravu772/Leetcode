class Solution {
    public boolean isAnagram(String s, String t) {
        char[] p=s.toCharArray();
        char[] k=t.toCharArray();
        Arrays.sort(p);
        Arrays.sort(k);
        return Arrays.equals(p,k);
    }
}