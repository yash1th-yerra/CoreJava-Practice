public class AlphaCheckLambda{
    public static boolean checkAlpha(String str){
        return(
            (str!=null)&&(str!="")&&(str.chars().allMatch(Character::isLetter))
        );
    }
    public static void main(String[] args) {
        String str = "Hello Brother";
        System.out.println(str);
        System.out.println("Output: "+checkAlpha(str));
    }
}