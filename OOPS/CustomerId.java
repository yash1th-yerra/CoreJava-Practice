public class CustomerId {
    static int count=0;
    int id;
    CustomerId(){
        count++;
        id=count;
    }
    int getId(){
        return id;
    }
    int localVar(){
        int a=10;
        return a;
    }
}
class Application {
    public static void main(String[] args) {
        CustomerId obj=new CustomerId();
        System.out.println("obj.id="+obj.getId());
        System.out.println("obj.id="+obj.getId());
        System.out.println("Local Variable="+obj.localVar());
    }
}
