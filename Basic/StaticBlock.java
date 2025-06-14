class StaticBlock 
{

    //STATIC BLOCK DIFFRENT FROM THE STATIC FUNCTION
    static {
          System.out.println("Static would be printed first.Even though the main is needed to run this prgram. But the static is going to be printed first. As the order of the functions execution will always be top to bottom.");
    }

    public static void main (String[] args){
        System.out.println("Main is printed after the static block. As it is below the static block.");

    }


}
