import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vx = s.nextInt();
        int vy = s.nextInt();
        int ux = s.nextInt();
        int uy = s.nextInt();

        int num = vx * ux + vy * uy;
        double den = (Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2)) * (Math.sqrt(Math.pow(ux, 2) + Math.pow(uy, 2))));
        double cos =  num / den;
//        System.out.println(cos);
        System.out.println(Math.toDegrees(Math.acos(cos)));

    }
}
