class MySingleton {
    static MySingleton instance=null;
    public int x=2;
    private MySingleton(){}
    static public MySingleton getInstance(){
        if(instance==null){
            instance=new MySingleton();
            return instance;
        }
    }
}

public class SingletonDemo{
    public static void main(String[] args) {
        MySingleton a=MySingleton.getInstance();
        MySingleton b=MySingleton.getInstance();
        a.x=a.x+10;
        System.out.println("a="+a.x);
        System.out.println("b="+b.x);
    }
}