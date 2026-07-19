import java.util.*;
public class sol1929 {
    public static void main(String[] args) {
        int[]nums={1,2,1};

        sol1929 obj=new sol1929();
        int[]ans=obj.getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
        
        
    }

    public int[] getConcatenation(int[] nums) {
        int [] ans= new int[2*(nums.length)];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
            
        
        }
        return ans;
    }
    
}
