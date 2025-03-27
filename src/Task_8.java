import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(isDigits(s,s.length()-1));
        double endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000000;
        System.out.println(duration);
    }
    /*
    * This method identify if string consist other symbols than Digits
    * It uses recursive approach
    * start from end of string and checking if a element of string is other symbols than Digits
    * and keep their true or false(if another symbol) values in res variable
    * @param text string itself, Curindex is current index (it start from end of text than to beginning of it)
    * */
    public static boolean isDigits(String text,int Curindex){
        if (Curindex==-1){
            return true;
        }
        boolean res;
        switch (text.charAt(Curindex)){
            case '1','2','3','4','5','6','7','8','9','0': res = true && isDigits(text, Curindex-1);break;
            default: return false;
        }
        return res;
    }
}
