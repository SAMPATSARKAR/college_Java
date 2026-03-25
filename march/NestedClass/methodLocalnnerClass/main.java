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
    void Student(){
        class Help{
            void helping(){
                System.out.println(name);
            }
        }
        Help h = new Help();
        h.helping();
    }
}
class main{
    public static void main(String[] args){
        
        Universal a = new Universal();
        a.Student(); 
    }
}