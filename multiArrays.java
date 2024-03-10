public class multiArrays {
    public static void main(String[] args) {
        //initialization of a 2D array

        int [][] flats = new int [2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println(flats.length);                      //print total number of rows only

        for(int i = 0; i < flats.length; i++) {
            for(int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
                }
            System.out.println();
        }
    }
}