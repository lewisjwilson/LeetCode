class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        int len = nums.length;
        for(int i = 0 ; i < len-1 ; i++){
            for(int j = i+1 ; j<len; j++){
                if(nums[i] + nums[j] == target){
                    out[0] = i;
                    out[1] = j;
                    break;
                }
                
            }
        }
        return out;
    }
}