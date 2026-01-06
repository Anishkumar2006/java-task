import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int product = 1;
        if (number == 0) {
            product = 0;
        } else {
            while (number != 0) {
                product = product * (number % 10); // get last digit
                number = number / 10;               // remove last digit
            }
        }
     System.out.println("Product of digits = " + product);
    }
}
