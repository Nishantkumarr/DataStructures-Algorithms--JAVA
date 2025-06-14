//NISHANTJAVA 
class BasicPatterns_2{

public static void main (String args[]){


    //Pattern-1

    for (int i =0 ; i<=5;i++){
        for(int j=i;j>0;j--){
            System.out.print("*");
        }
        System.out.print("\n");
    }
  
    //Pattern-2
    System.out.println(" Pattern - 2 ");
    int m = 2;

    for(int i=0;i<5;i++){

           if(i<=m){
                for(int k=0;k<m-i;k++){
                    System.out.print(" ");
                }

                for(int j=m-i; j<=m+i;j++){
                    System.out.print("*");
                }
                System.out.print("\n");
           }
           else
           {
                for(int k=0;k<i-m;k++){
                    System.out.print(" ");
                }

                for(int j=i-m;j<=m+(2*m-i);j++){
                    System.out.print("*");
                }
                System.out.print("\n");
           }
    }
        
    //Pattern-3
    System.out.print(" Pattern -3 ");
}



}