public class ToLowerCase_709 {
    public static void main(String[] args) {
        String str = "LoVelY";
        StringBuilder r = new StringBuilder(str);
        for(int i=0; i<r.length(); i++) {
            if(r.charAt(i) >= 'A' && r.charAt(i)<= 'Z') {
                r.setCharAt(i,(char)(r.charAt(i) + 32));
            }
        }
        System.out.println("r=" + r.toString());
    }
}
