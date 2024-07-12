public class ReverseString {
    public static String reverseIterative(String str) {
        if (str == null)
            return null;

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseIterative(str);
        System.out.println(reversed); // Output: "!dlroW ,olleH"
    }
}
