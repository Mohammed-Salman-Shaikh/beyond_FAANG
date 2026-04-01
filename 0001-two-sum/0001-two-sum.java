class Solution {
    public int[] twoSum(int[] nums, int target) {
	
		HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i< nums.length; i++){
		
			int compliment = target - nums[i];
			
			if(mpp.containsKey(compliment)){
				
				return new int[]{mpp.get(compliment), i};
			}
			
			mpp.put(nums[i], i);
		}
		return new int[]{};
    }
}