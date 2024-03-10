import java.util.Scanner;

//Program to find a student is pass or fail, if it requires total 40% and at least 33% in each subject to pass

// public class practice2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Science Marks = ");
//         int science = sc.nextInt();

//         System.out.print("Maths Marks = ");
//         int maths = sc.nextInt();

//         System.out.print("English Marks = ");
//         int english = sc.nextInt();

//         int total = science + maths + english;
//         int avg = total / 3;

//         if(avg >= 40 && science >= 33 && maths >= 33 && english >=33){
//                 System.out.println("Pass");
//         }

//         else{
//             System.out.println("Fail");
//         }

//         sc.close();
//     }
    
// }






//Question 2
// public class practice2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         float income = sc.nextFloat();

//         if(income >= 2.5 && income < 5.0){
//             System.out.println("Tax = 5%");
//         }

//         else if (income >= 5.0 && income <= 10.0) {
//             System.out.println("Tax = 10%");
//         }

//         else if(income >= 10.0){
//             System.out.println("Tax = 15%");
//         }

//         else if(income < 2.5){
//             System.out.println("Tax = 0%");
//         }

//         sc.close();
//     }
// }




/*Write a program to find out the type of website from the url
 * .com -> commercial website
 * .in -> indian website
 * .org -> organisational website
*/

public class practice2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();

        if(url.endsWith(".com")) {
            System.out.println("Commercial Website");
        }

        else if(url.endsWith(".in")) {
            System.out.println("Indian Website");
        }

        else if(url.endsWith(".org")) {
            System.out.println("Organisational Website");
        }
        sc.close();
    }
}

