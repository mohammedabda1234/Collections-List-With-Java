package Array.data.sturcture;

import java.util.Scanner;

public class CheckPair {
    public static void main(String[] args) {

        }
        public static void fill(int[] list){
            for (int i = 0; i < list.length ; i++) {
                list[i] = i * i;
            }
        }
        public static void Avg(int[] list){
            int total = 0;
            for (int i = 0; i < list.length; i++) {
                total += list[i];
            }
            double avrege = 0;
            if (list.length > 0)
                avrege = total / list.length;
        }

        public static void maxAndMin(int[] list){
            int max = list[0];
            int min = list[0];
            for (int i = 0; i < list.length; i++) {
                if (list[i] > max)
                    max = list[i];
                if (list[i] < min)
                    min = list[i];
            }
            System.out.println("max = "+max+" min = "+min);
        }

    public static int[] CumulativeSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i] ;
            arr[i] = sum;
        }

        return  arr;
    }

    public static void currentSize(int[] list){
        Scanner s = new Scanner(System.in);
        int current = 0;
        while (s.hasNextInt()){
            if (current < list.length){
                list[current] = s.nextInt();
                current++;
            }
        }
        for (int i = 0; i < current; i++) {
            if (i==-1)
            System.out.print(list[i]+" ");
        }
    }
}
