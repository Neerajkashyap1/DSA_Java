import java.util.Scanner;

class TwoD_Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int row = sc.nextInt();
        System.out.println("Enter the number of row ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element for which you want to find the index  ");
        int num = sc.nextInt();
        int a = 0, b = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (num == arr[i][j]) {
                    a = i;
                    b = j;
                    System.out.println(a + "," + b);
                }
            }
        }
    }
}
