import java.util.Scanner;
import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        res = (int) Math.pow(x, n);
        System.out.print(res);
    }
}
