//Multi-Inheritance is not possible in java but we can achieve it by using interfaces. In multi-inheritance, a class can inherit from more than one class. However, in Java, a class can only inherit from one class, but it can implement multiple interfaces. This allows us to achieve multiple inheritance in Java through the use of interfaces. An interface is a collection of abstract methods that a class can implement. By implementing multiple interfaces, a class can inherit the behavior defined in those interfaces, thus achieving multiple inheritance in a way.
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
    void greet(){
        System.out.println("greet Parent");
    }
}
class parent2{

}
class ChildOne extends Parent{// This line will cause a compilation error because Java does not support multiple inheritance through classes. A class cannot extend more than one class. To achieve multiple inheritance in Java, you can use interfaces instead of classes.
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
    @Override
    void greet(){
        System.out.println("greet Child");
    }
}
class ChildTwo extends ChildOne{
    ChildTwo(){
        super(); //calls Object class constructor
        System.out.println("child two constructor");
    }
}
public class MultiInhert{
    public static void main(String[] args){
        // Parent p1 = new Parent();
        // ChildOne c1 = new ChildOne();
        // ChildOne c2 = new ChildOne(50, 20);
        // c2.printData();
        // Parent p2 = new ChildOne();
        // p2.greetParent();
        // p2.greetChild(); // This line would cause a compilation error because Parent class doesn't have greetChild method
        // ChildTwo c3 = new ChildTwo();
        // ChildOne c4 = new ChildTwo(); //upcasting
        // c4.greetParent();// so it can access parent class method but not child class method i.e. greetChild() because reference variable is of type ChildOne
        // c4.greetChild(); // This line would cause a compilation error because reference variable is of type ChildOne and it doesn't have greetChild method, even though the actual object is of type ChildTwo which has greetChild method
        // constructor of childeOne will be called , becoz of that parent constructor will be called and (then child two constructor will be called as it is the object).
        // Parent p2 = new ChildOne(); //upcasting
        // ChildOne c5 = (ChildOne)p2; //downcasting--explicit only possible when reference variable is of type parent and actual object is of type child and no implicit downcasting is possible because it can lead to runtime error if reference variable is of type parent and actual object is of type parent then it will throw ClassCastException at runtime
        // c5.greetChild(); 
        // c5.greetParent(); // This line will work because reference variable is of type ChildOne and it has greetParent method, even though the actual object is of type ChildOne which has greetParent method
        // ChildOne c6 = (ChildOne)p2; //downcasting--explicit
        // c6.greetChild(); // This line will work because reference variable is of type ChildOne and it has greetChild method, even though the actual object is of type ChildOne which has greetChild method
        // c6.greetParent(); // This line will work because reference variable is of type ChildOne and it has greetParent method, even though the actual object is of type ChildOne which has greetParent method

        // Parent p = new ChildOne(); //upcasting--run time polymorphism--method overriding
        // p.greet();
        Parent p = new Parent();
        System.out.println(p);// it will print the reference variable of parent class because toString() method of Object class is called which returns the reference variable of the object
        Parent p2 = new Parent();
        System.out.println(p2==p);// it will print false because p2 and p are different objects
}
}
