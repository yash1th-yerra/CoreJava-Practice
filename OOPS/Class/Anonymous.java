class Hello {
    void show(){
        System.out.println("Hello World!");
    }
}
class Anonymous {
    static Hello h = new Hello();
    void show(){
        super.show();
        System.out.println("anonymous");
    }
    public static void main(String[] args) {
        h.show();
    }
}