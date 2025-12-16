import java.util.Scanner;
public  class bala{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    String s=Integer.toString(a);
    int length=s.length();
    int midindex=length/2;
    char midchar=s.charAt(midindex);
    System.out.println(midchar);    
}
}