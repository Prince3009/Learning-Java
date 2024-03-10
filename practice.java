//Write a program to convert string into lowercase characters
// public class practice {
//     public static void main(String[] args){
//         String name = "Ravi";
//         System.out.println(name.toLowerCase());
//     }
// }




//Replace spaces with underscores
// public class practice{
//     public static void main(String[] args){
//         String name = " R a v i ";
//         System.out.println(name.replace(" ","_"));
//     }
// }



//Replace string with another string
// public class practice{
//     public static void main(String[] args){
//         String letter = "Dear name, Thanks a lot!";
//         System.out.println(letter.replace("name","Prince"));
//     }
// }



//To detect double, triple and four spaces in a string
// public class practice{
//     public static void main(String[] args){
//         String letter = "Dear   Prince,      your are awesome   ";
//         System.out.println(letter.indexOf("  "));                                //To detect double spaces
//         System.out.println(letter.indexOf("   "));                               //To detect triple spaces
//         System.out.println(letter.indexOf("    "));                              //To detect four spaces

//     }
// }




//program to format a letter using escape sequence characters
public class practice{
    public static void main(String[] args){
        String letter = "Dear Prince,\n\t You are awesome\n\t Thanks for being nice";
        System.out.println(letter);
    }
}