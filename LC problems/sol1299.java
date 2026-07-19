
import java.util.Arrays;

public class sol1299 {
    public static void main(String[] args) {
        int []arr={17,18,5,4,6,1};
        sol1299 obj=new sol1299();
        int ans[]=obj.replaceElements(arr);
        System.out.println(Arrays.toString(ans));
        
    }
    public int[] replaceElements(int[] arr) {
        int[]ans=new int[arr.length];
        int MaxRunningR=-1;
        for(int i=arr.length-1 ;i>=0;i--){
            ans[i]=MaxRunningR;
            if(arr[i]>MaxRunningR)
            MaxRunningR=arr[i];
            

    }

    return ans;
}
}
