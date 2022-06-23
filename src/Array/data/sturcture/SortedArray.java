package Array.data.sturcture;

public class SortedArray {
    public static void main(String[] args) {
        //int[] list = {2,3,4,6,7,8,10};
        // test binary search
//        int low = 0,high = list.length -1,key = 15 ;
//        int result = binarySearch(list,low,high,key);
//        System.out.println(result);
        //test insert
//        int[] list = new int[10];
//        list[0] = 10;
//        list[1] = 20;
//        list[2] = 30;
//        list[3] = 40;
//        list[4] = 50;
//        list[5] = 60;
//        int n = 6,capacity = list.length ,key = 35;
//        System.out.println("Before insert");
//        for (int i = 0; i <n ; i++) {
//            System.out.print(list[i]+" ");
//        }
//        System.out.println();
//        n = insert(list,n,capacity,key);
//        for (int i = 0; i < n ; i++) {
//            System.out.print(list[i]+" ");
//        }


        int[] list = {10,20,30,40,50};
        int n = list.length ,key = 40;
        System.out.println("before delete");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
         n = delete(list,n,key);
        System.out.println("After delete");
        for (int i = 0; i < n ; i++) {
            System.out.print(list[i]+" ");
        }
    }
    static int delete(int arr[], int n, int key)
    {
        // Find position of element to be deleted
        int pos = binarySearch(arr,0,n-1,key);
        if (pos == -1){
            System.out.println("element not fount");
            return n;
        }
        // deletion
        int i;
        for (i= pos;i<n -1;i++)
            arr[i] = arr[i + 1];// shift element
        return  n-1;
    }
    public static int insert(int[] arr,int n,int capacity,int key){
        //cont not insert if n greater or equal capacity
        int i;

        if (n >= capacity)
            return n;

        for ( i = n -1;(i>=0 && arr[i] > key) ; i--)
            arr[i + 1] = arr[i];
        arr[i + 1] = key;
        return  n+1;
    }
    //binary search alog using array 1D
    public static int binarySearch(int[] arr,int low,int high,int key){
        if (high < low){//base condition
            return -1 ;
        }
        int mid = (low + high)/2;
        if (key == arr[mid]){
            return mid;
        }
        if (key > mid)
            return binarySearch(arr,low+1,high,key);
        else
            return binarySearch(arr,low,low-1,key);
    }

}
