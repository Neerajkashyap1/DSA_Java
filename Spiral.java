import java.util.Scanner;

class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers of rows");
        int row = sc.nextInt();
        System.out.println("enter the numbers of columns");
        int col = sc.nextInt();
        int l = 0, r = col - 1, t = 0, b = row - 1, d = 0;
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        if (row == 0 || col == 0) {
            System.out.println("Invalid input");
        }

        while (t <= b && l <= r) {
            if (d == 0) {
                for (int i = l; i <= r; i++) {
                    System.out.print(arr[t][i] + " ");
                }
                d = 1;
                t++;
            } else if (d == 1) {
                for (int i = t; i <= b; i++) {
                    System.out.print(arr[i][r] + " ");
                }
                d = 2;
                r--;
            } else if (d == 2) {
                for (int i = r; i >= l; i--) {
                    System.out.print(arr[b][i] + " ");
                }
                d = 3;
                b--;
            } else if (d == 3) {
                for (int i = b; i >= t; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                d = 0;
                l++;
            }
        }
    }
}
