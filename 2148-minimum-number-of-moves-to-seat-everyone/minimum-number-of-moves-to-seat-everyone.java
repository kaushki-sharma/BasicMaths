class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // Find the maximum value in the seats and students arrays
        int maxt = seats[0];
        int max2 = students[0];
        
        for (int i = 1; i < seats.length; i++) {
            maxt = Math.max(maxt, seats[i]);
        }
        
        for (int i = 1; i < students.length; i++) {
            max2 = Math.max(max2, students[i]);
        }
        
        int maxft = Math.max(maxt, max2);
        int[] diff = new int[maxft + 1]; // +1 to avoid index out of bounds
        
        // Update the diff array based on seats and students
        for (int i = 0; i < seats.length; i++) {
            diff[seats[i]]++;
            diff[students[i]]--;
        }
        
        // Compute the prefix sum in diff array
        for (int i = 1; i < diff.length; i++) {
            diff[i] += diff[i - 1];
        }
        
        // Calculate the total moves required
        int ans = 0;
        for (int i = 0; i < diff.length; i++) {
            ans += Math.abs(diff[i]);
        }
        
        return ans;
    }
}

//Line sweep algorithm