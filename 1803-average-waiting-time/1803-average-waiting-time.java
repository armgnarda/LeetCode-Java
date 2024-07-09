class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        long totalWaitingTime = 0;

        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int orderTime = customer[1];
            
            // Chef starts preparing the order either when the customer arrives or when he's done with the previous order
            currentTime = Math.max(currentTime, arrivalTime);
            
            // Calculate the waiting time for the current customer
            int waitingTime = (currentTime + orderTime) - arrivalTime;
            
            // Update the current time after completing this order
            currentTime += orderTime;
            
            // Accumulate the total waiting time
            totalWaitingTime += waitingTime;
        }

        // Calculate the average waiting time
        return (double) totalWaitingTime / customers.length;
    }
}