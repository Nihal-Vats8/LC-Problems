public class sol1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        sol1832 obj = new sol1832();
        boolean result = obj.checkIfPangram(sentence);
        System.out.println(result);
    }

    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            seen[c - 'a'] = true;
        }

       
        for (int i = 0; i < 26; i++) {
            if (seen[i] == false) {
                return false;
            }
        }

        return true;
    }
}