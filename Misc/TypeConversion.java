public class TypeConversion {
    //widening 
    static void widening(){
        int x= 10;
        long y  = x;
        double z = y;
        System.out.println(x+" "+y+" "+z);
    }
    //narrowing
    static void narrowing(){
        double x  = 10;
        long y = (long)x;
        int z = (int)y;
        byte a = (byte)z;
        System.out.println(x+" "+y+" "+z+" "+a);

    }
    //type Promotion
    static void typePromotion(){
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result);

    }
    public static void main(String[] args) {
        widening();
        narrowing();
        typePromotion();
    }
    
}