public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.print("*");
        for (int m = 1; m <= 8; m++) {
            System.out.print("_");
        }
        System.out.println("*");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("_");
            }

            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }

            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
        for (int j = 1; j <= 1; j++) {
            System.out.print("*");
        }
    }
}
