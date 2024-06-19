class Solution {
    double maxVolume(double perimeter, double area) {
        // code here
        double l = (perimeter - Math.sqrt((perimeter*perimeter)-(24*area)))/12;
        double volume = ((perimeter*l*l) - (8*l*l*l))/4;
        
        return volume;
    }
}