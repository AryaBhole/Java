import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

//         int[] res ={0, 0}; 
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(nums[i] + nums[j] == target){
//                     res[0] = i;
//                     res[1] = j;
//                     break;
//                 }
//             }
//         }
//         System.out.println(res[0] + " " + res[1]);
    
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x) && map.get(x) != i) {
                System.out.println(i + " " + map.get(x));
            }
        }

    }
}