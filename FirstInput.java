import java.util.Scanner;
public class FirstInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     System.out.print("a = ");
    //         //int a = sc.nextInt();
    //         float a = sc.nextFloat();
    //         System.out.print("b = ");
            
    //         //int b = sc.nextInt();
    //         float b = sc.nextFloat();
            
    //         float sum = a+b;
    //         System.out.println("sum = " + sum);
    //         sc.close();
    //     }    
    // }




 // Check whether the given input is of int type or not
    // boolean b = sc.hasNextInt();                         //similarly we can use nextFloat, nextChar, nextByte
    // System.out.println(b);
    // //sc.close();             //sc.close is not mandatory    
//         }
// }




//Another example for String type
 // String str = sc.next();                                //This sc.next command will only print one word before space so we will use nextLine
    String str = sc.nextLine(); 
    System.out.println(str);
    sc.close();
    }
}
