public class Mock{
    public void condition(){
        int n=5;
        if(n== 4){
            System.out.println("HI");
        }
        else{
            System.out.println("BYE");
        }
    }
    public static void main(String[] args){
        Mock m = new Mock();
        m.condition();
    }
}