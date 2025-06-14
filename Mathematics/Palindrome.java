import java.util.Scanner;

public class Palindrome{


    static int ReverseInput(int a, int temp){
        if (a==0) return temp;
        temp  = (temp*10)+(a%10);
        return ReverseInput(a/10 , temp);

    }
    static String Palindrome(int a){
        
        int revInput ;
        revInput = ReverseInput(a,0);
        if (a == revInput) return "Yes";
        return "No";
    }
    public static void main(String[] Args ){

        Scanner Sc  = new Scanner (System.in);
        int inputNumber = 0;
        String res  = "";
        System.out.println(" Enter the number for which the palindrome operation needs to be performed :- ");
        inputNumber  = Sc.nextInt();
        res = Palindrome(inputNumber);        
        System.out.print( " The result is :- " + res);
        
    }
}