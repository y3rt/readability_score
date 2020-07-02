import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int xCount = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'c':
                case 'C':
                case 'g':
                case 'G':
                    xCount++;
                    break;
                default:
                    // nothing to see here
            }
        }
        double result = ((double) xCount / str.length()) * 100;
        System.out.println(result);
    }
}
