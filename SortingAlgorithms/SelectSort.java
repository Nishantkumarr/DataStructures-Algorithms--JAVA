//SelectionSorting 
//Nth Max Element of Array 
import java.util.Scanner;  
class  SelectSort{

    public static void main (String Args[]){

       int A[] = new int [10000];
       Scanner Sc = new Scanner(System.in);

       System.out.print("Enter the length of the Array :- ");
       int lenA = Sc.nextInt();
       
       System.out.println(" Enter the Array  :- ");
       for(int i=0;i<lenA;i++){
        A[i] = Sc.nextInt();
       }

        System.out.println(" Entered Array is :- ");
        for(int i=0;i<lenA;i++){
        System.out.print(A[i]+" ");
        }
     
        System.out.println("Total Length of the entered array is : -");
        System.out.print(lenA);
         //Sorting Algorithm Implementation 

        for(int i = 0; i<lenA;i++){
            int minIndex = i;
            for(int j = i; j<lenA;j++){
                if(A[minIndex]>A[j]){
                    minIndex=j;
                    //System.out.println(minIndex);
                    //System.out.print("minChanges");
                }
            }
            int p = A[i];
            A[i] = A[minIndex];
            A[minIndex] = p;
        }
     

       System.out.println(" Entered Array is :- ");
        for(int i=0;i<lenA;i++){
        System.out.print(A[i]+" ");
       }


       Sc.close();
    }
}