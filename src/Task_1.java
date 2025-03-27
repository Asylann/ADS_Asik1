import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Minimum(arr));

        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method identify minimum element of array
    * It uses iterative approach
    * O(n) complexity time
    * The loop iterates through all elements,
    * always saving minimum of them,
    * if find the element that less than current min, replace!
    * @param array itself
    * @return Minimum element of array
    * */
    public static int Minimum(int[] arr){
        int min = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}