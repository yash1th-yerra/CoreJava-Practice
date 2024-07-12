import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class CompetReader {
    public FastReader{
        BufferedReader br;
        StringTokenizer st;
        FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next(){
            while(st==null||!st.hasMoreElements()){
                st = new StringTokenizer(st.nextLine());
            }
            return st.nextToken();
        }
        public String nextLine(){
            try{
                st = br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return st;
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }
        public float nextFloat(){
            return Float.parseFloat(next());
        }
        public char nextChar(){
            return next().charAt(0);
        }
        public void close(){
            try{
                br.close();
            }
            catch(IOException e){
            e.printStackTrace();
            } 
        }
    }     
    public static void main(String[] args){
        CompetReader reader = new CompetReader();
        System.out.println("Enter Integer:");
        int num = reader.nextInt();
        System.out.println("Enter String:");
        String str = reader.next();
        System.out.println("Enter Double:");
        double dbl=reader.nextDouble();
        System.out.println("Integer:"+num);
        System.out.println("string:"+str);
        System.out.println("double:"+dbl);
        reader.close();
    }
}     


