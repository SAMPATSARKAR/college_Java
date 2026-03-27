// class Universal{
//     String name="LPU";
//     static String country = "INDIA";
//     static class DataBase{
//         void getData(){
//             System.out.println(country);
//         }
//     }
//     class work{
//         void study(){
//             System.out.println("Study in: "+ name +","+country);
//         }
//     }
//     void Student(){
//         class Help{
//             void helping(){
//                 System.out.println(name);
//             }
//         }
//         Help h = new Help();
//         h.helping();
//     }
// }

abstract class Sports{
    abstract void play();
}

class Sports2 extends Sports{

    void play(){
        System.out.println("Playing cricket");
    }
}
class main{
    public static void main(String[] args){
        Sports2 s1 = new Sports2();
        s1.play();
        //anonymous class
        Sports s2 = new Sports(){
            void play(){
                System.out.println("Playing golf");
            }
        };
    s2.play();
    s2.play();
    }
}