import java.util.Scanner;
public class problem9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+a+" is: "+factorial);
    }
    
} 