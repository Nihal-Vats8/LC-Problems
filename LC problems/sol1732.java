public class sol1732 {
    public static void main(String[] args) {
        int[]gain={-5,1,5,0,-7};
        sol1732 onj=new sol1732();
        System.out.println(onj.largestAltitude(gain));
        
    }
    
    
    public int largestAltitude(int[] gain) {
        int currentAlt = 0;
        int maxAlt = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAlt += gain[i];
            if(currentAlt>maxAlt){
                maxAlt=currentAlt;

            }
    
}
return maxAlt;
        
        

    }

    
}
