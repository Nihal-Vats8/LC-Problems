public class sol1512 {
    public static void main(String[] args) {
        int[]nums={1,2,3,1,1,3};
        sol1512 obj= new sol1512();
        int gp=obj.numIdenticalPairs(nums);
        System.out.println(gp);
        
    }
    public int numIdenticalPairs(int[] nums) {
        int gp=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){ 
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                    temp+=1;
                    
                }

            }
            gp=temp;
        }
        return gp;
    }
    
}
