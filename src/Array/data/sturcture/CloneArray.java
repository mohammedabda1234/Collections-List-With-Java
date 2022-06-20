package Array.data.sturcture;

public class CloneArray {
    public static void main(String[] args) {
        int[] array = {4,5,8,6};
        int[] cloneArray = array.clone();
        for (int i = 0; i <cloneArray.length ; i++) {
            System.out.println(cloneArray[i]);
        }
    }
}
