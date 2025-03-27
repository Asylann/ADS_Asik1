import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (is_Prime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method identify if the given number is Prime number or not
    * It uses iterative approach
    * O(√n) or sqrt(n)
    * it start from 2 and checking if n is divisible by i,
    * then it is Composite number , if not until i*i,
    * then it is Prime number
    * @param n number that is considered as Prime or Composite
    * @return true if is Prime number, false if is Composite number
    * */
    public static boolean is_Prime(int n){
        if(n<2) return false;
        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
