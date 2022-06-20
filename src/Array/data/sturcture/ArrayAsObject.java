package Array.data.sturcture;
// Java program to illustrate creating
//  an array of objects
class Student {
    int roll_no;
    String name;
    Student(int roll_no,String name){
       this.roll_no = roll_no;
       this.name =name;
    }
}
// create array are object of class student
public class ArrayAsObject {
    public static void main(String[] args) {
         Student[]arr = new  Student[5];
        // initialize the first elements of the array
        arr[0]= new  Student(1,"Ali");
        arr[1]= new  Student(2,"Ahmed");
        arr[2]= new  Student(3,"John");
        arr[3]= new  Student(4,"Sarah");
        arr[4]= new  Student(5,"Divid");

        //access the element
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("element :"+i+" "+arr[i].roll_no+" "+arr[i].name);
        }
    }
}
