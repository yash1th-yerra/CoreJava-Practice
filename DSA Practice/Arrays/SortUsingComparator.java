
import java.util.*;
public class SortUsingComparator{    
    public static void main(String[] args){
        Student [] arr={
            new Student (3,"Rahul","delhi"),
            new Student (1,"Vishal","Gurgaon"),
            new Student (2,"kamal","pune"),
        };
        System.out.println("Before Sorting:");
        for(Student s:arr)System.out.println(s);
        Arrays.sort(arr,new SortByRoll());
        System.out.println("After Sorting:");
        for(Student s:arr)System.out.println(s);

    }
}
class Student {
    int rollno;
    String name,address;
    public Student(int rollno,String name,String address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return this.rollno+" "+this.name+" "+this.address;
    }
}
class SortByRoll implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.rollno-b.rollno;
    }
}
