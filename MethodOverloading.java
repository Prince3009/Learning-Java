//two or more function have same name but different parameters
public class MethodOverloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(String a){
    System.out.println("Hello");
    }

    static void foo(int b, String c){
        System.out.println(b +" " + c);
    }

    public static void main(String[] args) {
        foo();                                      //this will call foo()
        foo(3000);                                 //this will call foo(int a)
        foo("Pri");                                //this will call foo(String a)
        foo(23, "S");                            //this will call foo(int b, String c)
    }
}
