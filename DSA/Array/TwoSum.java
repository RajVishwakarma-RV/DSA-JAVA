import java.util.Arrays;
import java.util.HashMap;public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i]; 
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
        public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        TwoSum solver = new TwoSum();
        int[] result = solver.twoSum(nums, 5);
        System.out.println(Arrays.toString(result)); 
    }
}