public class SequenceSum{
    public static void main(String[] args) {
    
        int i =5;
        int j=9;
        int k=6;
        int sum = 0;
        for(int num=i;num<=j;num++){
            sum = sum+num;
        }
        for(int num=j-1;num>=k;num--){
            sum = sum+num;
        }
        System.out.println("Sequence sum: "+sum);
    }
}