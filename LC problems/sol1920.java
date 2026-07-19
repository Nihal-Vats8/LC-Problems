import java.util.*;
public class sol1920 {
    public static void main(String[] args) {
        int[]nums={0,2,1,5,3,4};
        sol1920 obj=new sol1920();
        int[]ans=obj.buildArray(nums);
        System.out.println(Arrays.toString(ans));
        
    
    }


    public static int[] buildArray(int[]nums){
        int[]ans= new int [nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
    return ans;
    }
}
