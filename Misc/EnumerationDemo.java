// Enumeration 
// if we use main() in enum we can directly invoke the enum from command prompt
//we can loop over enum 
// we can use enum in switch statements
//enum can't extend classes as it already extending java.lang.enum and it is static and final bydefault 
//but it can implement many interfaces
//the constructor inside a enum can be executed seperately for each value in enum
//we can also have methods in enum
enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
class Test {
    Day day;
    public Test(Day day){
        this.day = day;
    }
    public void dayIsLike(){
        switch(day){
            case MONDAY:
            System.out.println(day);
            break;
            case TUESDAY:
            System.out.println(day);
            break;
            case WEDNESDAY:
            System.out.println(day);
            break;
            case THURSDAY:
            System.out.println(day);
            break;
            case FRIDAY:
            System.out.println(day);
            break;
            case SATURDAY:
            System.out.println(day);
            break;
            default:
            System.out.println("invalid input");
            break;
        }
    }

}
public class EnumerationDemo {
    public static void main(String[] args) {
        String str = "MONDAY";
        Test t = new Test(Day.valueOf(str));
        t.dayIsLike();
    }
}