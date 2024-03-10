public class ReverseArray {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int l = arr.length;
    int n = Math.floorDiv(l, 2);                   // we can directly use n/2 also in loop below
    int temp;
    
    for(int i = 0; i < n; i++) {       //here we take i < n because we will swap all elements 5 times beacuse size of length is 10
        temp = arr[i];
        arr[i] = arr[l-1-i];
        arr[l-1-i] = temp;
         }
        
    for(int i : arr){
        System.out.print(i + " ");
        }


    //Another method(using new empty array)
    // int[] arr1 = new int[l];
    // for(int i = 0; i < l; i++) {
    //     arr1[i] = arr[l-1-i];
    // }                                       
    //then use for each loop
    }
}
