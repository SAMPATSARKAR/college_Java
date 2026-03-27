import java.util.*;

class main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        list.stream()
            .filter(x->x%2==0)
            .forEach(System.out::println);
        list.stream()
            .map(x->x*x)
            .forEach(System.out::println);
    }
}