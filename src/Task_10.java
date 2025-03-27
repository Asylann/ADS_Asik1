import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(GCD(a,b));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * It calculates the Greatest Common Divisor (GCD) using Euclidean Algorithm.
    * It uses recursive way
    * Formula: GCD(a, b) = GCD(b, a % b)
    * Base case: is when b == 0 return a
    * O(log(min(a,b)) time complexity
    * @param a and b numbers
    * @return the Greatest Common Divisor (GCD) between a and b
    * */
    public static int GCD(int a,int b){
        if (b == 0) return a;
        return GCD(b,a%b);
    }
}
