class ab extends Exception{

}

public class ExceptionHandling{
    public static void validate(int age){
        if(age<18){
            try{
                throw new ab();
            }
            catch (ab e)
            {
                System.out.println("this age is not allowed");
            }
        }
        else{
            System.out.println("Person is eligible to vote!!!");
        }
    }
    
    public static void main(String[] args){
        validate(18);
        System.out.println("rest of the code...");
    }
}