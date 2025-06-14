//ArrayReversal 
class ReverseArray{

    public static void main (String Args[]){

        String A[] = Args;
        String RA[] = new String [A.length];

        int p = 0;

        for (int i=A.length-1;i>=0;i--){
            RA[p] = A[i];
            p++;
        }

        System.out.println("The contents of the Array  is :- ");
        for(int i = 0;i<A.length;i++){
            System.out.print(A[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        
        System.out.println("The contents of the Array when reversed is :- ");
        for(int i = 0;i<RA.length;i++){
            System.out.print(RA[i]);
            System.out.print(" ");
        }

    }
}