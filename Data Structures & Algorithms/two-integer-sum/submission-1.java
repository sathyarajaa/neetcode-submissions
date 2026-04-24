class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i];
            if(seen.containsKey(remaining))
            {   if(i>seen.get(remaining))
                return new int[]{seen.get(remaining),i};
                return new int[]{i,seen.get(remaining)};
            }
            seen.put(nums[i],i);

        }
        return new int[0];
    }
}
