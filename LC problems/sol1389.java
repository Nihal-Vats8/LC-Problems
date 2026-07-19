import java.util.ArrayList;
import java.util.Arrays;

class sol1389{
    public static void main(String[] args) {
        int[]nums={0,1,2,3,4};
        int[]index={0,1,2,2,1};
       
        sol1389 obj=new sol1389();
        int[]target=obj.createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>target=new ArrayList<Integer>();
        for(int i =0;i<nums.length;i++){
            target.add(index[i], nums[i]);
        }
        int[]arr=new int[nums.length];
         for(int k=0;k<nums.length;k++){
            arr[k]=target.get(k);
            
         }       
        

            

            return arr;
        }
        
        
    }



