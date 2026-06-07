class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> items = new HashMap<>();
        int c = 0;
        int d =0;
        for(int i=0;i<nums.length;i++){
            c = target-nums[i];
            if(!items.containsKey(c)){
                items.put(nums[i],i);
            }
            else{
                d = i;
                c = items.get(c);
                break;
            }
        }
        return new int[]{c,d};
    }
}
