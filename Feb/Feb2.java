import java.util.Scanner;
public class Feb2{
    // int a = sc.nextInt(System.in);
    // int b = sc.nextInt(System.in);
    public static void main(String[] args){
        int n = 6;
        int p = 2;
        int bmn = 1<<p;
        int newbmn = ~bmn;
        int x = newbmn & bmn;
        System.out.println(x);
        int newNum;

        if((n & bmn) == 0){
            newNum = n|bmn;
        }else{
            newNum = n & (~bmn);
        }
        System.out.println(newNum);

    }
}