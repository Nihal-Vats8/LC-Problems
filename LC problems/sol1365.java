import java.util.Arrays;
public class sol1365 {
    public static void main(String[] args) {
        int[]nums= {8,1,2,2,3};
        sol1365 obj=new sol1365();
        int[]ans=obj.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count+=1;
                }
            
                
            }
            
            ans[i]=count;
        }
        return ans;




    }
    
}
