class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int empty = 0;
        int full = numBottles;

        while (full > 0) {
            totalDrunk += full;     
            empty += full;          
            full = empty / numExchange; 
            empty = empty % numExchange; 
        }

        return totalDrunk;
    }
}