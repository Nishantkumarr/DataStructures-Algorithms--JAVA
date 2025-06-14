import java.util.Scanner;
public class SortZeroOne{


    public static void main ( String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the array :- ");
        int arr_size =10;
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        

        int[] arr = new int[arr_size];
        int a=0;
        for(int i=0;i<arr_size;i++){
            a  = Sc.nextInt();
            arr[i]=a;
        }
        
        for(int i:arr){
            if(i==0) {countZero++;}
            if(i==1) {countOne++;}
            if(i==2) {countTwo++;}
        }

        System.out.print(" The count of 0 , 1 , 2 :- ");
        System.out.print(Integer.toString(countZero)+'\n');
        System.out.print(Integer.toString(countOne)+'\n');
        System.out.print(Integer.toString(countTwo)+'\n');

        System.out.print("The entered array is ");
        for(int i :arr){
            System.out.print(i);
        }
        Sc.close();

    }


}