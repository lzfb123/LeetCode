public class SortArrayByParity_905 {
    public static void main(String[] args) {
        int[] A = new int[]{3,1,2,4};
        int[] r = new int[A.length];
        int odd = 0;
        int even = 0;
           for (int i : A) {
               if (i % 2 == 0) {
                   r[even] = i;
                   even++;
               }
               else {
                   r[r.length-1 - odd ] = i;
                   odd++;
               }
           }
        for (int i : r) {
            System.out.print(i + " ");
        }
    }
}
