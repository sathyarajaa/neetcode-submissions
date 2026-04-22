class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0) return false;
        HashMap<Integer,Integer> hasDuplicate = new HashMap<>();
        hasDuplicate.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(!hasDuplicate.containsKey(nums[i])){
                hasDuplicate.put(nums[i],i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}