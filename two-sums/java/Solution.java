class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ADD EACH NUMBER TOGETHER TO FIND AND RETURN
        // INDICIES WHEN WHEN SUM OF NUMBERS ADD UP
        // TO TARGET
        int arrayPosition = 0;
        int arrayLength = nums.length;
        for(int num : nums){
            int nextPosition = arrayPosition + 1;
            while (nextPosition < arrayLength){
                int sum = num + nums[nextPosition];
                if (sum == target){
                    int[] two = {arrayPosition, nextPosition}; 
                    return two; 
                }
                nextPosition++; 
            }
            arrayPosition++;
        }
        return null; 
    }
}
