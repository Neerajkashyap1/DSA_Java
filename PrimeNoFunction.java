import java.util.*;

public class PrimeFunction {
    public static void Prime(int num) {
        if(num>0){
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
    
        }
        else {
            System.out.println("Enter a Positive Number");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Prime(num);

    }
}
