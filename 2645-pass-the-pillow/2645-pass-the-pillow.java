class Solution {
    public int passThePillow(int n, int time) {
        int cycleLength = 2 * n - 2;
    int effectiveTime = time % cycleLength;
    
    if (effectiveTime < n) {
        return effectiveTime + 1;  // Moving forward
    } else {
        return 2 * n - effectiveTime - 1;  // Moving backward
    }
    }
}