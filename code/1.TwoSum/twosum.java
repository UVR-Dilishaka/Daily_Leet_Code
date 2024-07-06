import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){

                return new int[] {i,map.get(compliment)};

            }

            map.put(nums[i],i);
 
            
        }
        return new int[]{99999,999999};

    }



    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));


    }


    
}
