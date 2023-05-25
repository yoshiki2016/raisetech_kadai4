import java.util.List;
public class Main {

    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println("*************************************");
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println); // 偶数を表示
        System.out.println("*************************************");
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println); // 奇数を表示
        System.out.println("*************************************");
        numbers.stream().filter(number -> number % 3 == 0).forEach(System.out::println); // 3の倍数を表示
    }
}
