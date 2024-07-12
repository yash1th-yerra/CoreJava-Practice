public class Student {
    public void studentId(String name,int rollno){
        System.out.println("name:"+name+",Roll-no:"+rollno);
    }
    public void studentId(int rollno,String name) {
        System.out.println("name:"+name+",roll-no:"+rollno);
    }

}
class Main{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.studentId("Yashwanth",564);
        obj.studentId(564,"yashwanth");
    }
}