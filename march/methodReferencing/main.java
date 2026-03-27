import java.util.*;

class main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        // list.forEach(x -> System.out.printf("%d ",x));//lambda exp
        list.forEach(System.out::println);//method referencing
    }
}