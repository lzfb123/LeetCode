import java.util.Arrays;

public class UniqueMorseCodeWords_804 {
    public static void main(String[] args) {
        temp tt = new temp();
        String[] words = new String[]{};
        tt.ttt(words);
    }
}
   class temp {
        public int ttt(String[] words) {
           if (words.length == 0) {
               return 0;
           }

            String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            String[] w = new String[words.length];
            String[] t = new String[words.length];
            int r = 0;
            int[][] z = new int[words.length][words[0].length()];
            for (int i = 0; i < words.length; i++) {
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < words[i].length(); j++) {
                    z[i][j] = (int) words[i].charAt(j) - 'a';
                    temp.append(morse[z[i][j]]);
                }
                w[i] = temp.toString();
            }
            for (String i : w) {
                if (!Arrays.asList(t).contains(i)) {
                    t[r] = i;
                    r++;
                }
            }
            return r;
        }
    }

