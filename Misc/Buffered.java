import java.io.*;
public class Buffered{
    public static void main(String[] args) throws IOException {
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        String name=bfn.readLine();
        int i=Integer.parseInt(bfn.readLine());
        System.out.println(name);
        System.out.println(i);
    }
    
}
// Buffered Reader class can pass chcecked exception so exceptions must be used.
/*public class Buffered{
    public static void main(string [] args){
        BufferedReader bfn=new BufferedReader(new InputStreamReader(System.in));
        try{
            String s=bfn.readLine();
            System.out.println(s);
        }
        catch (Exception e){
            System.out.println(e);

        }
    }
    
}
 */
