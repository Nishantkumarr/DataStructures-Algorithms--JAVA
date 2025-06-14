//Nth Max Element of Array 
import java.util.Scanner;  
class Nth_Max_Element{

    public static void main (String Args[]){

       int A[] = new int [100000];

       Scanner Sc = new Scanner(System.in);

       System.out.println(" Enter the Array  :- ");
       for(int i=0;i<10;i++){
        A[i] = Sc.nextInt();
       }

     
       for(int i=0;i<10;i++){
        for( int j=i;j<10;j++){
             if(A[i]<A[i+1]){
            int c =A[i];
            A[i] = A[i+1];
            A[i+1] = c;
        }
        }
        }
     
     

       System.out.println(" Entered Array is :- ");
        for(int i=0;i<10;i++){
        System.out.print(A[i]+" ");
       }



    }
}