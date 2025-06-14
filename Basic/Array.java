//ArrayDeclarations 
class Array 
{

  
    public static void main (String[] args){
        System.out.println("Different ways to declare and initiate an array : = ");

        
        //Mehtod-1
        int a [][] ;
        a = new int [10][20];

        //Method-2
        int [][] p = new int[200][500];

        //Method-3
        int x [][] = {{10,20},{20,40,60},{10,40,30,40,50,60}};


        //ArrayMethods
            //Length Method
            System.out.println("The length of first array of multi dimensional array x = " + x[0].length);
            System.out.println("And the elements of the arrays are : - ");
            System.out.println(x[0]); //This would return the class name like [I for int followed by a random hashcode.
            System.out.println("The length of Second array of multi dimensional array x = " + x[1].length);
            System.out.println("The length of Third array of multi dimensional array x = " + x[1].length);

    }


}
