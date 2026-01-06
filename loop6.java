import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;          // get last digit
            reverse = reverse * 10 + digit;  // reverse the number
            number = number / 10;             // remove last digit
        }

        if (original == reverse) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is NOT a Palindrome");
        }
    }
}
