import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(BinomialCef(n,k));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method calculate binomial coefficient
    * It uses recursive approach
    * base cases: when k==0 or k==n
    * recursive case: BinomialCef(n-1,k-1)+BinomialCef(n-1,k)
    * @param n(element that stay in the bottom of C) and k(element that stay in the top of C),
    * @return binomial coefficient of Cn^k
    * */
    public static int BinomialCef(int n,int k){
        if(k==0||k==n) return 1;
        return BinomialCef(n-1,k-1)+BinomialCef(n-1,k);
    }
}
