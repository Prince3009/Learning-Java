public class MultiException {
    public static void main(String[] args) {
        try{
            int a = 10, b = 2, c;
            c = a/b;
            System.out.println(c);

            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);

            String str = "Prince";
            System.out.println(str.toUpperCase());
        }

        //Catch will only run when there are errors in try part otherwise try will run only
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Exception");
        }
        
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        
        catch(NumberFormatException s){
            System.out.println("Number exception");
        }

        catch(Exception d){
            System.out.println("All Exception");
        }
        
    }
}
