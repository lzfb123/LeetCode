import java.lang.reflect.Array;
import java.util.*;


public class test {
    public static void main(String args[]) {

      int x = 10;
      int y = 9;
      int l;
      int r = 0;
      StringBuilder xx = new StringBuilder();
      StringBuilder yy = new StringBuilder();
      while (x>=1) {
          xx.append(x % 2);
          x /= 2;
      }

      while (y>=1) {
          yy.append(y % 2);
          y /= 2;
      }

      if(xx.length() > yy.length()) {
          l = xx.length() - yy.length();
          for(int i=0; i<l;i++){
              yy.append(0);
          }
          l = xx.length();
      } else {
          l = yy.length() - xx.length();
          for (int i=0; i<l; i++) {
              xx.append(0);
          }
          l = yy.length();
      }

      for (int i=0; i<l; i++) {
          if(xx.charAt(i) != yy.charAt(i)) {
              r++;
          }
      }
      System.out.println(r);
    }
}



