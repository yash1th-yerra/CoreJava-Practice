//ArrayIndexOutBoundsException
public class ArrayIndexOutBoundsExceptionDemo {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[7] = 5;
            System.out.println("a[7]=" + a[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}