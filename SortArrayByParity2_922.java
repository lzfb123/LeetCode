public class SortArrayByParity2_922 {
    public static void main(String[] args) {
        int[] A = new int[]{4,2,5,7};
        int[] r = new int[A.length];
        int even = 0;
        int odd = 1;
        for(int i : A) {
            if(i % 2 == 0) {
                r[even] = i;
                even += 2;
            }
            else {
                r[odd] = i;
                odd += 2;
            }
        }
        for (int i: r) {
            System.out.print(i + " ");
        }
    }
}
