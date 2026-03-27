class Universal{
    String name="LPU";
    static String country = "INDIA";
    static class DataBase{
        void getData(){
            System.out.println(country);
        }
    }
    class work{
        void study(){
            System.out.println("Study in: "+ name +","+country);
        }
    }
}
class main{
    public static void main(String[] args){
        Universal obj = new Universal();
        Universal.work a = obj.new work();
        a.study();
        // a.getData();
    }
}