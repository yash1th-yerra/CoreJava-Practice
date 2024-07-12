//constructor chaining using this()
class ConsChain {
    
    ConsChain(){
        this(5);
        System.out.println("default");
    }
    ConsChain(int x){
        this(5,5);
        System.out.println("cons2");
    }
    ConsChain(int x,int y){
        System.out.println("cons3");
    }
    {
        System.out.println("Init");//init is executed before any constructor.
    }

    public static void main(String[] args) {
        new ConsChain();
    }

}
class B extends A {
    B(){
        super();//super call to parent class's default no-arg constructor.
        System.out.println("From base class")
    }
}
