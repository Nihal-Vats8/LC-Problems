import java.util.Arrays;

public class sol66 {
    public static void main(String[] args) {
        int[]digits={9,9,9};
        sol66 obj=new sol66();
        int[]ans=obj.plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }

    public int[] plusOne(int[] digits) {
    boolean allNines = true;

    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] == 9) {
            digits[i] = 0;
        } else {
            digits[i] += 1;
            allNines = false;
            break;
        }
    }

    if (allNines) {
        int[] upArr = new int[digits.length + 1];
        upArr[0] = 1;
        return upArr;
    }

    return digits;
}




}
