import java.util.Scanner;
public class Factorial{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter a number:");
        long Factorial=1;
        for (int i=1; i<=a; i++){
            Factorial = Factorial * i;
        }
        System.out.println("Factorial of " + a +" is:"+Factorial);
    }
}