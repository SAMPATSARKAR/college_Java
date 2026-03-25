class Universal{
    String name="LPU";
    static String country = "INDIA";
    static class DataBase{
        void getData(){
            System.out.println(country);
        }
    }
}
class main{
    public static void main(String[] args){
        Universal.DataBase a = new Universal.DataBase();
        a.getData();
    }
}