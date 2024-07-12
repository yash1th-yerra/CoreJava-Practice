public class palindromePro{
    public static String breakPalindrome(String str){
        char[] arr = str.toCharArray();
        Boolean flag = true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag =  false;
                break;
            }
        }
        if(flag){
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!='a'){
                    arr[i]='a';
                    return new String(arr);
                }
            }
            
        }
        
        return "IMPOSSIBLE";
     
    }
    public static void main(String[] args) {
        String input = "aabbaa";
        String result = breakPalindrome(input);
        System.out.println(result); // Output: IMPOSSIBLE
    }
}
