import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        // restore sign if number was negative
        if (num < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number = " + reverse);
        sc.close();
    }
}
