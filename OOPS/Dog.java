public class Dog {
    String name;
    String breed;
    int age;
    String color;
    public Dog(String name,String breed,int age,String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int  getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return  ("name :"+this.getName()+","+"breed :"+this.getBreed()+","+"age :"+this.getAge()+","+"color :"+this.getColor());
    }
    public static void main(String args[]){
        Dog leo=new Dog("leo","labradour",2,"brown");
        System.out.println(leo.toString());
    }
}
//creating object 
//Dog obj=new Dog();//using new
//Dog obj=(Dog)Class.forName("Dog").newInstance();//using instance method
//Dog obj=new obj(); Dog obj2=(Dog)obj2.clone();
//Deserialization method refer in further

