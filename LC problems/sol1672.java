public class sol1672 {
    public static void main(String[] args) {
        int[][]accounts={{1,2,3},{3,2,1}};
        sol1672 obj=new sol1672();
        int MaxW=obj.maximumWealth(accounts);
        System.out.println(MaxW);

        
    }

    public int maximumWealth(int[][] accounts) {
        int MaxW=0;
        for(int i=0;i<accounts.length;i++){
            int temp=0;

            for(int j=0;j<accounts[i].length;j++){
                temp+=accounts[i][j];
                
            }

            MaxW = Math.max(MaxW,temp);
            
        
        }
        return MaxW;


    }
}
