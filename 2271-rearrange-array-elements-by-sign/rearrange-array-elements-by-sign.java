class Solution {
    public int[] rearrangeArray(int[] nums) {
              int n = nums.length;
        int[] result = new int[n];

        // Arrays to store positives and negatives
        int[] positives = new int[n / 2];
        int[] negatives = new int[n / 2];
        int pos = 0, neg = 0;

        // Separate positives and negatives using a for loop
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                positives[pos++] = nums[i];
            } else {
                negatives[neg++] = nums[i];
            }
        }

        // Fill result array alternating from positives and negatives
        int index = 0;
        for (int i = 0; i < n / 2; i++) {
            result[index++] = positives[i];
            result[index++] = negatives[i];
        }

        return result;
    }
        
    }
