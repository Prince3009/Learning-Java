public class Methods {
    //Method 1
    /* 
    static int logic(int x, int y){                  //here static is compulsory because we do not create any object here
        int z;
        if(x > y)
        z = x+y;

        else
        z = (x+y)*5;

        return z;
    }

    public static void main(String[] args){
        int a = 5, b=6, c, c1;
        c = logic(b,a);                           //output-55                      //call method logic
        c1 = logic(a,b);                          //output-11                       //call method logic
        System.out.println(c);
        System.out.println(c1);
        */



    //Method 2
    int logic(int x, int y){                  //if we do not want to use static then we have to create object
        int z;
        if(x > y)
        z = x+y;

        else
        z = (x+y)*5;
    //If we assign any value to x and y in both methods, instead of that it will not reflect main method but in case of array it will reflect main method
    x = 10;
    y = 60;
        return z;
    }

    public static void main(String[] args){
        int a = 5, b=6, c, c1;
        Methods obj = new Methods();                   //creating object
        c = obj.logic(b,a);                           //output-55                      //call method logic
        c1 = obj.logic(a,b);                          //output-11                       //call method logic
        System.out.println(c);
        System.out.println(c1);
        System.out.println("a = " + a + " b = " + b);
        
    }
}
