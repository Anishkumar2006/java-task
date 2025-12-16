import java.util.Scanner;
public class problem11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int last=a%10;
        int first=a;
        while(first>=10){
            first=first/10;
        }
            int sum=first+last;
            System.out.println(sum);
        
    }
}