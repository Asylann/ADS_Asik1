import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(Factorial(n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method calculated the factorial of n
    * It uses a recursive approach
    * O(n) complexity
    * Iterates from n to 1
    * if n==0 returns 1 cause 0!=1
    * @param the number for which factorial is to be calculated
    * @return The factorial of n
    * */
    public static int Factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
}
