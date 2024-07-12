import java.util.*;public class Wrapping {
    public static int sumOfOddNum(List<Integer> list){
        int sum = 0;
        for(Integer i : list){
            if(i%2 != 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            myList.add(i);
        }
        int sumOdd = sumOfOddNum(myList);
        System.out.println("Sum of Odd Numbers: "+sumOdd);
    }
}