public class FlippingAnImage_832 {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] r = new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[i].length; j++) {
                if(A[i][j] == 0) {A[i][j]++;}
                else {A[i][j]--;}
                r[i][A[i].length-1 - j] = A[i][j];
            }
        }
        for(int[] i : r) {
            System.out.print("{");
            for (int j: i) {
                System.out.print(j + ",");
            }
            System.out.print("},");
        }
    }
}
