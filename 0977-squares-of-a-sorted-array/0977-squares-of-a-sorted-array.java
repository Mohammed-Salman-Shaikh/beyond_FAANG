class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];

        int right = n-1;
        int left = 0;

        for(int i=n-1; i>=0; i--){
            int rightSquare = nums[right] * nums[right];
            int leftSquare = nums[left] * nums[left];

            if(leftSquare>rightSquare){
                result[i] = leftSquare;
                left++;
            }
            else{
                result[i] = rightSquare;
                right--;
            }
        }
        return result;
    }
}