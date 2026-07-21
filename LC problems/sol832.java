import java.util.Arrays;

public class sol832{
    public static void main(String[] args) {
        int[][]imagee={
            {1,1,0},{1,0,1},{0,0,0}
        };
        sol832 obj=new sol832();
        int[][]ans=obj.flipAndInvertImage(imagee);
        System.out.println(Arrays.deepToString(ans));
    }

    public int[][] flipAndInvertImage(int[][] imagee) {
        int[][]ans=new int[imagee.length][imagee[0].length];
        for(int i=0;i<imagee.length;i++){
            for(int j=imagee[i].length-1;j>=0;j--){
                ans[i][j]=imagee[i][(imagee.length-1)-j];
                if(ans[i][j]==0){
                    ans[i][j]=1;

                }else{
                    ans[i][j]=0;
                }

            }
        }
        return ans;
        
    }











}
