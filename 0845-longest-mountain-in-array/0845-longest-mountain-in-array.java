class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int best = 0;

        for(int i=1; i<n-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                int l = i, r = i;
                while(l>0 && arr[l-1] < arr[l]) l--;
                while(r<n-1 && arr[r+1] < arr[r]) r++;
                best = Math.max(best, r-l+1);
            }
        }
        return best;
    }
}