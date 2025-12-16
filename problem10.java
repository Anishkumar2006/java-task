public class Main{
    public static void main(String[]args){
        int num =234;
        int lastDigit= num%10;
        int firstDigit= num/100;
        int sum= firstDigit+lastDigit;
        System.out.println("Sum of frist and last digit= " +sum);

    }

}