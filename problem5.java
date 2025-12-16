import java.util.Scanner;
public class problem5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            if(a%3==0)
            System.out.println("Even and multiple of 3");
            else
            System.out.println("Even but not multiple of 3");
            }else{
            System.out.println("Odd");
          } 
      }
    }
