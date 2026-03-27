class Maths{//utility class
    private Maths() {};
    static int add(int a,int b){
        return a+b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
}

class Main{
    public static void main(String[] args){
        System.out.println(Maths.add(2,1));
    }
}