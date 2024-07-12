public class Add {
    public void add(int a,int b){
        System.out.println("sum="+(a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("sum="+(a+b+c));

    }
    public void add(double a,double b,double c){
        System.out.println("sum="+(a+b+c));
    }
}
class Main {
    public static void main(String[] args) {
        Add a=new Add();
        a.add(10,20);
        a.add(10,20,30);
        a.add(1.0,2.5,1.5);
    }
}