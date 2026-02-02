import java.util.Scanner;
// public class Feb2{
//     // int a = sc.nextInt(System.in);
//     // int b = sc.nextInt(System.in);
//     public static void main(String[] args){
//         int n = 6;
//         int p = 2;
//         int bmn = 1<<p;
//         int newbmn = ~bmn;
//         int x = newbmn & bmn;
//         System.out.println(x);
//         int newNum;

//         if((n & bmn) == 0){
//             newNum = n|bmn;
//         }else{
//             newNum = n & (~bmn);
//         }
//         System.out.println(newNum);

//     }
// }
// ------------
public class Feb2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        switch(s){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}