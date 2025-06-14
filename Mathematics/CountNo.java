import java.util.Scanner;

public class CountNo {


    static int CountDigits( int a ){
        if (a==0) return 0;
        return 1+CountDigits(a/10);
    }
    public static void main(String[] Args ){

        Scanner Sc  = new Scanner (System.in);
        int inputNumber = 0;
        int  cntDgts  = -1;
        System.out.println(" Enter the number for which the operation needs to be performed :- ");
        inputNumber  = Sc.nextInt();
        cntDgts = CountDigits(inputNumber);        
        System.out.print( " The result is :- " + Integer.toString(cntDgts));
        
    }
}