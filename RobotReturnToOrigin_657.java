public class RobotReturnToOrigin_657 {
    public static void main(String[] args) {
        String moves = "UDLRRLDUULD";
        int ud = 0;
        int lr = 0;
        boolean r;
        for(int i=0; i<moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U': {ud++; break;}
                case 'D': {ud--; break;}
                case 'L': {lr++; break;}
                case 'R': {lr--; break;}
            }
        }
        r = (ud == 0 && lr == 0);
        System.out.print("r=" + r);
    }
}
