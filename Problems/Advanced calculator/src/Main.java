/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        int maxMarker = Integer.MIN_VALUE;
        int minMarker = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i < args.length; i++) {
            int val = Integer.parseInt(args[i]);
            if (val > maxMarker) {
                maxMarker = val;
            }
            if (val < minMarker) {
                minMarker = val;
            }
            sum += val;
        }
        if (args[0].equals("MAX")) {
            System.out.println(maxMarker);
        } else if (args[0].equals("MIN")) {
            System.out.println(minMarker);
        } else {
            System.out.println(sum);
        }
    }
}
