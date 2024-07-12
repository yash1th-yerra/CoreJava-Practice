import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1000);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2 = "";
            while (!str.equals("stop")) {
                str = (String) din.readUTF();
                System.out.println("You: " + str);
                str2 = br.readLine();

                dout.writeUTF(str2);
                dout.flush();

            }
            din.close();
            s.close();
            ss.close();

            // String str = (String) dis.readUTF();
            // System.out.println("Message: " + str);
            // ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}