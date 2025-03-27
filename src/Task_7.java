import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ShowR(scan,n);

        System.out.println();
        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method shows sequence in reverse order
    * By using recursive principles
    * O(n) time complexity because it is just call another from another
    * @param n is len of sequence, scan for input
    * @return Show reverse sequence
    * */
    public static void ShowR(Scanner scan, int n){
        if(n==0) return;
        int curNum = scan.nextInt();
        ShowR(scan,n-1);
        System.out.print(curNum+" ");
    }
}
