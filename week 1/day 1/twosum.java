import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int tar) {
        HashMap<Integer, Integer>map= new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int first= nums[i];
            int sec= tar- nums[i];
            if(map.containsKey(sec)){
                return new int[]{map.get(sec),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

}
