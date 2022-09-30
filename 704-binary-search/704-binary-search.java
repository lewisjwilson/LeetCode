class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        for(Integer i : nums){
            if(i==target){return count;}
            count++;
        }
        return -1;
        
    }
}