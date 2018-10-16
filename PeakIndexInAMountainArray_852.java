public class PeakIndexInAMountainArray_852 {
    public static void main(String[] args) {
        int[] A = new int[]{0,2,1,0};
        int r = 0;
        while (A[r] < A[r+1]) {
            r++;
        }
        System.out.print("r=" + r);
    }
}
