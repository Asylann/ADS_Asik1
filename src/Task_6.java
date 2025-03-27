import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int n = scan.nextInt();

        System.out.println(My_pow(a,n));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method calculated a number in nth power
    * Base case: when n == 0 will return 1
    * Recursive cases : a*My_pow(a,n-1) and that one if n is negative,
    * that will return 1/ My_pow(a,-n)
    * O(n) time complexity
    *
    * @param a The base number
    * @param n The exponent
    * @return The result of a^n
    * */
    public static double My_pow(int a,int n){
        if(n==0){
            return 1;
        } else if (n<0) {
            return 1/My_pow(a,-n);
        }
        return a*My_pow(a,n-1);
    }
}
