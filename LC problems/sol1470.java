import java.util.Arrays;

public class sol1470 {
    public static void main(String[] args) {
        int[]nums={2,5,1,3,4,7};
        sol1470 obj=new sol1470();
        int[]ans=obj.shuffle(nums, 3);
        System.out.println(Arrays.toString(ans));
    }
    public int[] shuffle(int[] nums, int n) {
        int [] ans =new int[nums.length];
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            x=nums[i];
            y=nums[i+n];
            ans[i*2]=x;
            ans[i*2+1]=y;
            

        }
        return ans;
    }
}
