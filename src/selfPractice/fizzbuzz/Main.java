package selfPractice.fizzbuzz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static selfPractice.fizzbuzz.Main.fizzbuzz;
import static selfPractice.fizzbuzz.Main.fizzbuzzString;

public class Main {

    public static void fizzbuzzString(int n) {
        //List<String> answer = new ArrayList(n);

        for (int i = 1; i <= n; ++i)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz,");
            } else if (i % 3 == 0) {
                System.out.print("Fizz,");
            } else if (i % 5 == 0) {
                System.out.print("buzz,");
            } else System.out.print(i +",");
}

    public static List<String> fizzbuzz(int n) {
        String d ;
        List<String> answer = new ArrayList(n);

        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("buzz" );
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(fizzbuzz(15));
        System.out.println(fizzbuzz(25));
        fizzbuzzString(15);
        System.out.println("\n");
        fizzbuzzString(25);

        List<String> list = Arrays.asList("abc1", "def2", "fghi3");
        long size = list.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted().count();
        System.out.println(size);
        List<String> list1 = list.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted().collect(Collectors.toList());
        System.out.println(list1);
        

//
//        List<String> list2 = Arrays.asList("abc1", "def2", "fghi3");
//        //counter = 0;
//        Stream<String> stream = list.stream().filter(element -> {
//           // wasCalled();
//            return element.contains("2");
//        });
//        System.out.println(stream);
    }
}