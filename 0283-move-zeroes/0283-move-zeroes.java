class Solution {
    public void moveZeroes(int[] nums) {
        // Pointer to track where the next non-zero element should be placed
        int insertPos = 0;

        // Step 1: Shift non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}