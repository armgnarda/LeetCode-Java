class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int emptyBottles = 0;

        while (numBottles > 0) {
            // Drink all the full bottles
            totalDrank += numBottles;
            emptyBottles += numBottles;

            // Calculate the new number of full bottles we can get by exchanging empty bottles
            numBottles = emptyBottles / numExchange;

            // Update the number of empty bottles left
            emptyBottles = emptyBottles % numExchange;
        }

        return totalDrank;
    }
}