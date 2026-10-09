class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1, i=0;

        while(i <= high){
            if(nums[i] == 0){
                swap(nums, low, i);
                low++;
                i++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                swap(nums, i, high);
                high--;
            }
        } 
    }
    private void swap(int[] a, int x, int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
}