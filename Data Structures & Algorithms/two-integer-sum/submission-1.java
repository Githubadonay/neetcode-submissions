class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> collect = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            collect.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int cal = target - nums[i];

            if( collect.containsKey(cal) && collect.get(cal) != i){
                return new int[]{i, collect.get(cal)};
            }
        }

    return new int [0];
    }
}
