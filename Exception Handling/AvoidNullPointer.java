//Avoid NullPointerExceptions
class SingleTon {
    private static SingleTon single = null;
    public int i=10;
    private SingleTon(){}
    public static SingleTon getInstance(){
        if(single == null){
            single = new SingleTon();
        }
        return single;
    }
}
public class AvoidNullPointer {
    public static void main(String[] args) {
        SingleTon s = SingleTon.getInstance();
        System.out.println(s.i);
        String str = null;
        String Res = (str!=null && "gfg".equals(str))? "Same ": "Not Same";
        System.out.println(Res);
        try{
            if( "gfg".equals(str))
                System.out.println("same");//NullPointerException
            else
                System.out.println("not same");
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }    
    }
}