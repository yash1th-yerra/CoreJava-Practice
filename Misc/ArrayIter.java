import java.util.Scanner;
class Student {
    int roll;
    String name;
    Student(int roll,String name) {
        this.name = name;
        this.roll = roll;

    }

}
public class ArrayIter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[4];
        for(int i=0;i<arr.length;i++){
            arr[i] = new Student(sc.nextInt(),sc.next());
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].roll+arr[i].name);
        }
        sc.close();
    }
}