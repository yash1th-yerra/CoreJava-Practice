import java.io.*;
class Operators{
    public static void main(String[] args) {
        int a=10,b=3;
        System.out.println("Arthimetic operations:");
        System.out.println("Addition:"+a+"+"+b+"="+ (a+b));
        System.out.println("Subtraction:"+a+"-"+b+"="+ (a-b));
        System.out.println("Multiplication:"+a+"*"+b+"="+(a*b));
        System.out.println("Division:"+a+"/"+b+"="+(a/b));
        System.out.println("Modulus:" + a+"%"+b +"=" + (a %b));
        System.out.println("Increment Operators:");
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));
        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));;
        System.out.println("Assignment Operators:");
        System.out.println(a+=2);
        System.out.println(b*=5);
        System.out.println("comparison Operators:");
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a!=b);
       /*/ System.out.println("logical Operators:");
        boolean a=true,b=false;
        System.out.println((a&&b));
        System.out.println((a&&a));
        System.out.println((a||b));
        System.out.println((a||a));
        System.out.println((!a));*/
        System.out.println(a+""+b);
        System.out.println("Bitwise oeprators:");
        System.out.println("d & e: " + (a & b));
        System.out.println("d | e: " + (a | b));
        System.out.println("d ^ e: " + (a ^ b));
        System.out.println("~d: " + (~a));
        System.out.println("d << 2: " + (a << 2));
        System.out.println("e >> 1: " + (b >> 1));
        System.out.println("e >>> 1: " + (b >>> 1));

    

    


    }
}