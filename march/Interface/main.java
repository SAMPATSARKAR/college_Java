// @FunctionalInterface
interface Sports{
    void play(int a);
    // void notPlay();
}
interface Maths{
    int add(int a,int b);
}
class main{
    public static void main(String[] args){
        // Sports s1 = new Sports(){
        //     public void play(){
        //         System.out.println("Playing cricket");
        //     }
        //     public void notPlay(){
                
        //     }
        // };
        //lambda expression
        Sports s2 = (a)->{
            System.out.println("playing football"+a);
        };
        // Sports s3 = ()->{
        //     System.out.println("not playing football");
        // };
        s2.play(5);

        // s3.play();
        Maths c = (a,b)->a+b;
        System.out.println(c.add(2,1));
    }

}