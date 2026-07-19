import java.util.Arrays;

public class sol1430 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        sol1430 obj = new sol1430();
        int[]ans=obj.runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] runningSum(int[] nums) {
        int [] ans = new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
            ans[i]=total;
        }
        return ans;
        }
}