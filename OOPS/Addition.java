public class Addition {
    
    public int addTwoInt(int a,int b){
        return(a+b);
    }
}
class Main {
    public static void main(String[] args) {
        Addition add=new Addition();
        System.out.println("result:"+add.addTwoInt(5,5));
    }
}