class Solution {
     private int findFirst(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int index = -1; // Initialize to -1 (not found)
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                index = mid; // Update index and continue searching left
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int index = -1; // Initialize to -1 (not found)
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                index = mid; // Update index and continue searching right
                i = mid + 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
         int[] arr = new int[2];
        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);
        return arr;
        
    }
}