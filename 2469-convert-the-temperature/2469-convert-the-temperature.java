class Solution {
    public double[] convertTemperature(double celsius) {
        
        double[] temp  = new double[2];
        double kel = celsius + 273.15;
        double fah = celsius * 1.80 + 32.00;
        temp[0] = kel;
        temp[1] = fah;
        return temp;
        
    }
}