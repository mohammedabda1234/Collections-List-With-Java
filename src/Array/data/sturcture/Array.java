package Array.data.sturcture;

public class Array {

    public static int[] number(){
        int[] A = new int[3];
        A[0] = 2;
        A[2] = 4;
        A[1] = 3;
        return  A;
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     int[] arr = new int [20];
     arr = number();
     print(arr);
    }

}
