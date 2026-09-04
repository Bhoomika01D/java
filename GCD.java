import java.util.Scanner;

public class GCD {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a and b ");
        int b=sc.nextInt();
        int a=sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }System.out.println(a);
    }
}
