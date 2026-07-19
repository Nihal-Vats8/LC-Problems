import java.util.ArrayList;
import java.util.List;

public class sol1431 {
    public static void main(String[] args) {
        int[]candies={2,3,5,1,3};

        sol1431 obj=new sol1431();
        System.out.println(obj.kidsWithCandies(candies, 3));

        
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>result=new ArrayList<Boolean>(candies.length);
        int EC=extraCandies;
        int temp=0;
        int max=0;
        for(int j=0; j<candies.length;j++){
            if (candies[j]>max){
                max=candies[j];
            }
        }
        for(int i=0;i<candies.length;i++){
            temp=candies[i]+EC;
            if(temp>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }

        }
        return result;
    }
}
