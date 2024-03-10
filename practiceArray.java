
public class practiceArray {
    public static void main(String[] args){
        //create an array of 5 floats and calculate the sum
        /*
        float [] arr = {45f, 66.0f, 90.0f, 100.0f, 100.2f};
        float sum = 0;
        for(float i : arr){
            sum = sum + i;
        }
        System.out.println(sum);
        */


        //To find out whether a given integer is present in array or not
        /*
        int [] arr = {45, 65, 75, 85, 96};
        int givenInt = 95;
        boolean check = false;
        for(int i : arr){
            if(i == givenInt){
                check = true;
            }
        }
        System.out.println(check);
        */
       
       
        //average marks of an array using for each loop
        /*  
        int [] marks = {50, 89, 96, 99, 45, 63};
        float sum = 0;
        float avg = 0;
        for(int i : marks){
            sum = sum + i;
        }
        avg = sum / 6;
        System.out.println(avg);
        */




        //Find maximum number of an array
        /*
        int[] arr = {96, -32, 67, 87, 99, 65};
        int max  = Integer.MIN_VALUE;

        for(int i : arr) {
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
        */


        //Find minimum number of an array
        /*
        int[] arr = {87, 85, 54, 31, 32, 21, -56, -2};
        int min = Integer.MAX_VALUE;

        //int min = arr[0];

        for(int i : arr) {
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);
        */



        //Find whether array is sorted or not
        int[] arr = {23, 34, 56, 78, 89, 90};
        boolean isSorted = true;

        for(int i = 0; i < arr.length-1; i++){         //Here we traverse loop length-1 because in the below line it will throw an error (i+1=7) and array have only 6 elements
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
                
            }
        }

        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}




