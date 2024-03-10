import java.util.Scanner;
public class StudentPercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths marks: ");
        int mathsMarks = sc.nextInt();

        System.out.println("Enter science marks: ");
        int scienceMarks = sc.nextInt();

        System.out.println("Enter english marks: ");
        int englishMarks = sc.nextInt();

        int totalMarks = mathsMarks + scienceMarks + englishMarks;
        System.out.println("Total marks = " + totalMarks);

        float percentage = (float)(totalMarks) / 3;
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
