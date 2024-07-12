public class VowandCons{
    public static void vowandCons(String s) {
        if(s==null){
            System.out.println("String is empty");
            return;
        }
        int vowelCount=0;
        int consonentCount=0;
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowelCount++;
                }
                else{
                    consonentCount++;
                }
            }
        }
        System.out.println("vowelcount="+vowelCount);
        System.out.println("consonent count="+consonentCount);
    }
    public static void main(String [] args){
        String s=new String("Hello World");
        vowandCons(s);
    }   
}
