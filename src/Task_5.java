import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(Fib(n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method find nth number of fibonacci sequence
    * It uses a recursive approach
    * O(2^n) complexity because of function calls 2 other function,
    * and then they calls other 4 functions etc. 8,16...
    *
    * @param n the nth element
    * @return value of the nth element of Fib sequence
    * */
    public static int Fib(int n){
        if (n==0 || n==1) return n;
        return Fib(n-1)+Fib(n-2);
    }
}
