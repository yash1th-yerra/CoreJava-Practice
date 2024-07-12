//Chained Exception
public class ChainedException {
    public static void main(String[] args) {
        try{
            NumberFormatException ex = new NumberFormatException("Exception");
            ex.initCause(new NullPointerException("actaul cause"));    
            throw (ex); //throwing exception of type number format exception.
        }
        catch(NumberFormatException e){
            e.printStackTrace();
            e.getCause();
        }
    }
}