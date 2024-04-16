public class ExceptionArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[5]);
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }
}
