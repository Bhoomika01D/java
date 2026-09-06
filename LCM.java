import java.util.Scanner;

public class LCM {
    public static void main(String []args){
        Scanner sc=new Scanner(
                System.in);
        System.out.println("Enter the values for a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=Math.max(a,b);
        while(true){
            if ((i%a==0)&& (i%b)==0) {
                System.out.println("LCM=" + i);
                break;
            }
            i++;
        }
        sc.close();
    }
}
