class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Dry run: nums=[-1,2,1,-4], target=1
        Arrays.sort(nums);                          // → [-4,-1,1,2]
        int closest = nums[0] + nums[1] + nums[2];  // seed: -4+-1+1 = -4

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // closer to target than best so far? keep it
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum == target) return sum;   // exact hit, distance 0
                else if (sum < target) left++;   // too small → grow
                else right--;                    // too big → shrink
            }

            // ── values, target=1 ──
            // i=0(-4): L=1(-1)R=3(2) sum=-3 |−3−1|=4 < |−4−1|=5 → closest=-3; -3<1 L++
            //          L=2(1)R=3(2) sum=-1 |−1−1|=2<4 → closest=-1; -1<1 L++ ; L=3=R stop
            // i=1(-1): L=2(1)R=3(2) sum=2  |2−1|=1<2 → closest=2 ; 2>1 R-- ; L=2=R stop
            // → closest = 2
        }
        return closest;
    }
}