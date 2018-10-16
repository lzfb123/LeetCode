public class JewelsAndStones_771 {
    public static void main(String[] args){
        String J = "aA";
        String S = "aAAbbbb";
        int r = 0;

        for(int i=0; i<S.length(); i++) {
            for (int j=0; j<J.length(); j++) {
                if(S.charAt(i) == J.charAt(j)) {
                    r++;
                    continue;
                }
            }
        }
        System.out.println("r=" + r);
    }
}
