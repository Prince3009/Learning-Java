public class array {
    public static void main(String[] args) {
        
        
        //1st way to initialize an array
        //array index starts from 0 and ends with n-1

        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;
        System.out.println(marks[0]);


        //2nd way to initialize an array
        int [] marks2 = {100, 90, 80, 70, 60};
        System.out.println(marks2[4]);



        //method to find array length
        System.out.println(marks.length);
        System.out.println(marks2.length);


        //same data types are stored in the array
        String [] students = {"Prince", "Ravi", "Shivam", "Aditya", "Divyanshu", "Vaibhav"};
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students.length);



        //Displaying all elements of the array(for this we have to use loop)
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);                                   //array traversal
        }



        //Print all elements of array in reverse order
        for(int i = students.length; i >= 0; i--){
            System.out.println(students[i]);                                   //array traversal
        }
    }
}
