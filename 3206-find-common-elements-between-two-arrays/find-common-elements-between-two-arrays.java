class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];

        // Store nums2 elements for presence check
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums2) {
            set2.add(x);
        }

        // answer1
        for (int x : nums1) {
            if (set2.contains(x)) {
                ans[0]++;
            }
        }

        // Store nums1 elements for presence check
        Set<Integer> set1 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }

        // answer2
        for (int x : nums2) {
            if (set1.contains(x)) {
                ans[1]++;
            }
        }

        return ans;






        
    }
}