//SUM OF VALUES AT EVEN AND ODD PLACES 

//Import this to get all the basic functionality
import java.util.*;

class ArraySumAlternate{

    public static void main (String Args[]){
        String A[] =  Args;
        /*
            //System.out.print("Enter the contents of the Array");
            //Scanner sc = new Scanner(System.in);
            for(int i=0;i<A.length;i++){
                sc.nextInt(A[i]);
            }
        */
        int odd_sum = 0;
        int even_sum = 0;
        for(int i=0;i<A.length;i++){
            if (i%2==0){
                even_sum = even_sum+Integer.parseInt(A[i]);
            }else{
                odd_sum = odd_sum +Integer.parseInt(A[i]);
            }
        }

        System.out.print("The sum of values at odd places is :- ");
        System.out.println(odd_sum);

        System.out.print("The sum of values at even places is :- ");
        System.out.println(even_sum);


    }
}