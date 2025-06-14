import java.util.Scanner;
public class Calculator {


    static int Add (int a , int b ){ return a+b;};
    static int Sub (int a , int b ){ return a-b;};
    static int Mul (int a , int b ){ return a*b;};
    static int Rem (int a , int b ){ return a/b;};
    static int Mod (int a , int b ){ return a%b;};


    public static void main ( String[] Args ){
        int inputOne , inputTwo;
        int resultOpp = 0;
        String operator = "";
        Scanner sc  = new Scanner( System.in);
        System.out.print("Please let me know the operands that needs to be evaluated :- ");
        inputOne = sc.nextInt();
        inputTwo=  sc.nextInt();
        System.out.print(" Please enter the operation :- ");
        operator = sc.nextLine();
        operator = sc.nextLine();
        switch(operator){
            case "+" : resultOpp=Add(inputOne , inputTwo) ; break;
         case "-" : resultOpp=Sub(inputOne , inputTwo) ; break;
         case "*" : resultOpp=Mul(inputOne , inputTwo) ; break;
         case "/" : resultOpp=Rem(inputOne , inputTwo) ; break;
         case "%" : resultOpp=Mod(inputOne , inputTwo) ; break;
         default : System.out.print("Not a valid operator.");break;
        }
        
        System.out.println(" The operation executed successfullly and the result is :- " + Integer.toString(resultOpp));

    }


}