class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol= (long)length*(long)width*(long)height;
        boolean bulky= length>=10000 || width>=10000 || height>= 10000 || vol>=1000000000;
        boolean heavy=mass>=100;
        if(heavy && bulky){
            return "Both";
        }
        if(heavy){
            return "Heavy";
        }
        if(bulky){
            return "Bulky";
        }
        return "Neither";
    }
}