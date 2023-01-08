class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long l = (long)length;
        long w = (long)width;
        long h = (long)height;
        long c1 = (long)Math.pow(10,4);
        long c2 = (long)Math.pow(10,9);
        int heavy = 0;
        int bulky = 0;
        if(l>=c1 || w>=c1 || h>=c1 || l*w*h>=c2)
            bulky  = 1;
        if(mass>=100)
            heavy = 1;
        if(heavy==1 && bulky==1)
            return "Both";
        if(heavy==0 && bulky==0)
            return "Neither";
        if(bulky==1 && heavy==0)
            return "Bulky";
        if(heavy==1 && bulky==0)
            return "Heavy";
        return "Not Checked";
    }
}