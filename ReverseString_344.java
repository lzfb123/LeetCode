public class ReverseString_344 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder str = new StringBuilder(s);
        String r;
        for (int i=0; i<s.length(); i++){
            str.setCharAt(i,s.charAt(s.length()-1 - i));
        }
        r = str.toString();
        System.out.print("r=" + r);
    }
}
