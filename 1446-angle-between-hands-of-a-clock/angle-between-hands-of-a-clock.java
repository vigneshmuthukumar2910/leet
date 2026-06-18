class Solution {
    public double angleClock(int hour, int minutes) {
        double x=hour+minutes/60.0;
        double differ=(11.0*x)%12.0;
        return Math.min(differ,12.0-differ)*30.0;
    }
}