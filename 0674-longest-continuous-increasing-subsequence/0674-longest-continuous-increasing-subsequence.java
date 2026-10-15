class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;

        int best = 1;
        int curr = 1;

        for(int i=1; i<n; i++){
            if(nums[i-1] < nums[i]){
                curr++;
            }
            else{
                curr = 1;
            }
            best = Math.max(best, curr);
        }
        return best;
    }
}