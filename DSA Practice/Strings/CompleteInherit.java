class One {
    private int age;
    private String name;
    public void setAge(int a) {
        this.age = a;
        
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        this.name = n;
        
    }
    public String getName(){
        return name;
    }

}
class Two extends One {
    public void setInfo(int a, String n){
        super.setAge(a);
        super.setName(n);
        System.out.println("age: "+super.getAge()+" name: "+super.getName());
    }

}
public class CompleteInherit {
    public static void main(String[] args) {
        Two in = new Two();
        in.setInfo(25,"John"); // prints "age: 25 name
    }
}