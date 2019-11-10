package Arrays;

import java.util.Arrays;

public class biggestTwoNumbers {
    public static void main(String[] args) {
        int [] nums = {23, 1, 34, 3, 54, 54, 51};
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        String checked = "";
        
        for(int i = nums.length-1; i >= 0; i--){
            if(!checked.contains(nums[i] + "")) {
                System.out.println(nums[i]);
            }
            
        }
    }
}
