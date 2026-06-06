class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for(int num:nums){
            if(!uniqueNums.contains(num)){
                uniqueNums.add(num);
            }
            else{
               return true;
            }
        }
        return false;
        
    }
}