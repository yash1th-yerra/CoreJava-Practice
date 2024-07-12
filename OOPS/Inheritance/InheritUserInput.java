import java.io.*;
class Person {
    String name;
    int id;
    void setPerson(){
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name:");
            this.name = bf.readLine();
            System.out.println("Enter ID:");
            this.id = Integer.parseInt(bf.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    void displayPerson(){
        System.out.println(name+"\t"+id+"\t");
    }
}
class Employee extends Person {
    String desgn;
    double salary;
    void setEmployee(){
        try {
            
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Designation:");
            this.desgn = bf.readLine();
            System.out.println("Enter Salary:");
            this.salary = Integer.parseInt(bf.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    void displayEmployee(){
        
        System.out.println(desgn+"\t"+salary+"\t");
    }

}
public class InheritUserInput{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setPerson();
        e.setEmployee();
        e.displayPerson();
        e.displayEmployee();
        
    }
}
