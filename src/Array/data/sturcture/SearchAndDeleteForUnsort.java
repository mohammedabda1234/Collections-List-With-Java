package Array.data.sturcture;

public class SearchAndDeleteForUnsort {
    public static void main(String[] args) {
        // test searching function
//        int[] arr = {56,89,23,10,50};
//        int key = 50;
//        int result = findElement(arr,key);
//        System.out.println(result);

        //test inserting function
//        int[] array = new int[10];
//        array[0] = 20;
//        array[1] = 10;
//        array[2] = 50;
//        int capacity = 10;
//        int n = 3,key =40;
//        System.out.println("Before inserting");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i]+",");
//        }
//        System.out.println();
//        n  = insert(array,n,key,capacity);
//        System.out.println("After inserting");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i]+",");
//        }

        //test delete function
        int[] arr ={20,30,59,70,10};
        int n = arr.length;
        int key = 10;
        System.out.println("Before Delete");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After delete");
        n = delete(arr,key,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
    public static int findElement(int[]arr,int key){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int insert(int[] arr,int n,int key,int capacity){
        if(n>= capacity){
            return n;
        }else {
            arr[n] = key;
        }
        return (n + 1);
    }
    public static int delete(int[] arr,int key,int n){
        // Find position of element to be
        // deleted
        // we use findElement() function to find
        int position = findElement(arr,key);
        if(position == -1){
            System.out.println("Element not fount ");
            return n;
        }
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i+1];
        }
        return n-1;
    }
}
