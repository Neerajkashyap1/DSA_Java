public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 1; l++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int m = 1; m <= space; m++) {
                System.out.print(" ");
            }
            // System.out.println("*");

            for (int l = 1; l <= 1; l++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 1; l++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int m = 1; m <= space; m++) {
                System.out.print(" ");
            }
            // System.out.println("*");

            for (int l = 1; l <= 1; l++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
