//BubbleSort 
import java.util.Scanner;  
class  BubbleSort{

    public static void main (String Args[]){

       int A[] = new int [10000];
       Scanner Sc = new Scanner(System.in);

       System.out.print("Enter the length of the Array :- ");
       int lenA = Sc.nextInt();
       
       System.out.println(" Enter the Array  :- ");
       for(int i=0;i<lenA;i++){
        A[i] = Sc.nextInt();
       }
     
        System.out.println("Total Length of the entered array is : -");
        System.out.print(lenA);
         
        
        //Sorting Algorithm Implementation 
        for(int i = 0; i<lenA;i++){
            for(int j = 0; j<lenA-i-1;j++){
                if(A[j]>A[j+1]){
                    int p = A[j];
                    A[j] = A[j+1];
                    A[j+1] = p;
                }
            }
            
        }
     

       System.out.println(" Entered Array is :- ");
        for(int i=0;i<lenA;i++){
        System.out.print(A[i]+" ");
       }


       Sc.close();
    }
}