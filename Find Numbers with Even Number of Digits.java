class Solution {     
    public int findNumbers(int[] nums) {         
        int count = 0, t = 0;         
        for (int i = 0; i < nums.length; i++) {             
            t = Count_digit(nums[i]);             
            if (t % 2 == 0) {                 
                count++;              
            }
        }             
        return count;              
    } 


    public int Count_digit(int a) {             
        int temp = 0; 
        while (a != 0) {                 
            temp++;                 
            a = a / 10;              
        }             
        return temp;         
    } 
} 
