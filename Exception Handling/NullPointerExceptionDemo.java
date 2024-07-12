//NullPointer Exception
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("str length is " + str.length());
        }
        catch(NullPointerException e){
            e.printStackTrace();
    
        }
        String str1 = "geeks";
        try{
            System.out.println("char at 6 : "+str1.charAt(6));
        }
        catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}