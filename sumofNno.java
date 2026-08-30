public class sumofNno {
    public static void main (String [] args){
            int N=10;
            int sum=0;
            System.out.println("Finding Sum of " + N + "natural numbers using loop");
            for(int i=1; i<=N;i++){
                sum+=i;
            }
            System.out.println("sum is" + " "+ sum);
    }
}
