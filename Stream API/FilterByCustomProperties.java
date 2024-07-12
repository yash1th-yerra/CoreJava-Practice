import java.util.*;
class Employee{
    String name;
    int age;
    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Employee name: "+name;
    }
}
public class FilterByCustomProperties{
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Ram",35),
            new Employee("Lakshman",37),
            new Employee("Ravi",36)
        );
        list.stream().filter(x->x.age>35).forEach(System.out::println);

    }
}