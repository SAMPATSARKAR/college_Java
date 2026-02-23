class Parent extends Object{ //every class in java extends Object class by default
    int age;
    Parent(){
        super(); //calls Object class constructor,access methods,var,constructor 
        System.out.println("parent constructor");
    }
    Parent(int age){
        this.age = age;
        System.out.println("parameterized parent constructor");
    }
    void greetParent(){
        System.out.println("hello parent");
    }
}
class ChildOne extends Parent{
    int childAge;
    ChildOne(){
        super(); //calls parent constructor,access methods,var,constructor 
        System.out.println("child constructor");
    }
    // ChildOne(int parentAge,int childAge){
    //     super(parentAge); //calls parameterized parent constructor,access methods,var,constructor & to avoid error of no default constructor in parent class
    //     this.childAge = childAge;
    //     System.out.println("child constructor");
    // }
    void printData(){
        super.greetParent(); //access parent method
        System.out.printf("parent age: %d child age: %d",super.age,childAge);
    }
    void greetChild(){
        System.out.println("hello child");
    }
}
class ChildTwo extends ChildOne{
    ChildTwo(){
        super(); //calls Object class constructor
        System.out.println("child two constructor");
    }
}
public class main{
    public static void main(String[] args){
        // Parent p1 = new Parent();
        // ChildOne c1 = new ChildOne();
        // ChildOne c2 = new ChildOne(50, 20);
        // c2.printData();
        // Parent p2 = new ChildOne();
        // p2.greetParent();
        // p2.greetChild(); // This line would cause a compilation error because Parent class doesn't have greetChild method
        // ChildTwo c3 = new ChildTwo();
        ChildOne c4 = new ChildTwo(); //upcasting
        c4.greetParent();// so it can access parent class method but not child class method i.e. greetChild() because reference variable is of type ChildOne
        // c4.greetChild(); // This line would cause a compilation error because reference variable is of type ChildOne and it doesn't have greetChild method, even though the actual object is of type ChildTwo which has greetChild method
        // constructor of childeOne will be called , becoz of that parent constructor will be called and (then child two constructor will be called as it is the object).
}
}