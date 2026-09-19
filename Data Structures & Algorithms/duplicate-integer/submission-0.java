class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> exist = new HashSet<>();
        for( int num : nums){
            if(exist.contains(num)){
                return true;
            }
            exist.add(num);
        }
        return false;
    }
}