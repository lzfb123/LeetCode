public class HammingDistance_461 {
    public static void main(String[] args) {
          int x = 1;
    int y = 4;
    int r = 0;
    int xx = 0;
    int yy = 0;
        while (x>=1 || y>=1) {
                xx = x % 2;
                yy = y % 2;
                if(x == 0) {xx = 0;}
                if(y == 0) {yy = 0;}
                if(xx != yy) {r++;}
                x /= 2;
                y /= 2;
                }
                System.out.print("r=" + r);
                }
                }
