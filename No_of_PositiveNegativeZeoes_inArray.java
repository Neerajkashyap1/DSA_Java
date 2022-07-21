import java.util.Arrays;
import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it 
//should display the count of positive, negative and zeros entered.
public class No_int_zero {
    public static void count(int limit) {
        int arr[] = new int[limit];
        int negative = 0;
        int positive = 0;
        int zero = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < limit; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                positive++;
            } else if (arr[j] == 0) {
                zero++;
            } else {
                negative++;
            }
        }
        System.out.println("negative numbers are = " + negative + " and " + "Positive numbers are = " + positive
                + " Zeroes are = " + zero);
    }

    public static void main(String[] args) {
        System.out.println("Enter the amount of numbers you want to enter");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        count(limit);
    }

}
