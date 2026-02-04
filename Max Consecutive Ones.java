class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
               
                if (c > temp) {
                    temp = c;
                }
            } else {
                
                c = 0;
            }
        }
        
        return temp; 
    }
}