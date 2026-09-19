class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] found = new int[2];
        for( int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length;j++){
                if(nums[j] + nums[i] == target){
                    found[0] = i;
                    found[1] = j;
                    return found;
                }
            }
        }
        return found;

    }
}
