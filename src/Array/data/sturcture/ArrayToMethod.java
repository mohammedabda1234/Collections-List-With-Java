package Array.data.sturcture;

public class ArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {6,7,9,3,2,5};
        int result = sum(arr);
        System.out.println(result);

    }
    public static int sum(int[] arr){
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return  result;
    }
}
class Test{
    public static void main(String[] args) {
        int[] intArray = new int[3];
        byte[] byteArray = new byte[3];
        short[] shortArray = new short[3];

        //array of string
        String[] strArray = new  String[3];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(shortArray.getClass());
        System.out.println(byteArray.getClass());
        System.out.println(strArray.getClass());
    }
}