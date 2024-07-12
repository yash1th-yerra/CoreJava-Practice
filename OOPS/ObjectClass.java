/*Object class */
class Test implements Cloneable{
    int i = 4;
    String s = "name";
    @Override public int  hashCode(){
        return s.hashCode();
    }
    @Override public String toString(){
        return this.s + ":"+this.i ;
    }
    @Override protected void finalize(){
        System.out.println("finalize method is called");
        

        
    }
    @Override public Test clone(){
        try{
            return (Test)super.clone();
        }
        catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }



}
public class ObjectClass {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Hash code of object is: "+t.hashCode()); //calling
        System.out.println("String Representation is : "+t.toString());
        System.out.println("class name : "+t.getClass().getName());
        Test t2 = t.clone();
        System.out.println(t.equals(t2));
        System.out.println(t2);
        t = null ;
        System.gc();
    }
}