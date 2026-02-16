class student{
    String name;
    int roll;
    student(){
        this("unknown", -1);
        System.out.println("default constructor");
    }
    student(String name,int roll){
        this.name = name;
        this.roll = roll;
        System.out.println("parameterized constructor");
    }
    student(student s){
        this.name = s.name;
        this.roll = s.roll;
        System.out.println("copy constructor");
    }
    void printData(){
        System.out.printf("name: %s roll: %d",name,roll);
    }
}
class main{
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student("sampat", 23);
        // s1.printData();
        // System.out.println();
        // s2.printData();
        // student s3 = s2; //shallow copy--leads to copy of add and leads to change in both objects
        // s3.roll = 45;
        // System.out.println();
        // s2.printData();
        // s3.printData();

        // student s4 = new student(s2.name, s2.roll); //deep copy--leads to copy of data and leads to change in one object
        // s4.roll = 67;
        // System.out.println();
        // s2.printData();
        // System.out.println();
        // s4.printData(); 

        student s5 = new student(s2); //copy constructor--leads to copy of data and leads to change in one object
        s5.roll = 89;
        System.out.println();
        s2.printData();
        System.out.println();
        s5.printData();
    }
}