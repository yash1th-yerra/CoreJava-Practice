import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastReader {
    private BufferedReader br;
    private StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    // Read a line of input
    public String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Read a single word (token)
    public String next() {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(nextLine());
        }
        return st.nextToken();
    }

    // Read an integer
    public int nextInt() {
        return Integer.parseInt(next());
    }

    // Read a long
    public long nextLong() {
        return Long.parseLong(next());
    }

    // Read a double
    public double nextDouble() {
        return Double.parseDouble(next());
    }

    // Read a float
    public float nextFloat() {
        return Float.parseFloat(next());
    }

    // Read a character
    public char nextChar() {
        return next().charAt(0);
    }

    // Close the reader when no longer needed
    public void close() {
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Test the custom reader class
    public static void main(String[] args) {
        FastReader reader = new FastReader();

        System.out.print("Enter an integer: ");
        int num = reader.nextInt();

        System.out.print("Enter a string: ");
        String str = reader.next();

        System.out.print("Enter a double: ");
        double doub = reader.nextDouble();

        System.out.println("Entered integer: " + num);
        System.out.println("Entered string: " + str);
        System.out.println("Entered double: " + doub);

        reader.close();
    }
}