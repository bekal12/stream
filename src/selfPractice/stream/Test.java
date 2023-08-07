package selfPractice.stream;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(47);
        a.add(72);
        a.add(45);
        a.add(89);
        a.add(47);
        a.add(72);
        a.add(450);
        a.add(899);

        Integer v = a.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second largest" + v);
        a.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("peek and count");
        long  d = a.stream().peek(System.out::println).distinct().count();
        System.out.println(d);
        System.out.println("end peak and count");
        Collections.sort(a);
        System.out.println(a);

        a.stream().collect(Collectors.toList()).forEach(System.out::println);

        a.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("******** array *******");
        String[] strings = {"ababaiyitu", "kebede", "alemu", "city"};
        Stream.of(strings).sorted((s1,s2 )->Integer.compare(s1.length(), s2.length())).forEach(System.out::println);
        Arrays.stream(strings).sorted().forEach(System.out::println);

        System.out.println("*********** comparable interface ******** ");

        List<Person> people = getPeople();
        Collections.sort(people);
        // System.out.println(people);
        /*people.stream()
                .collect(Collectors.toList())
                .forEach(System.out::println);*/
        System.out.println("********###################");
        people.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("******** listout all persons  *******");
//people.stream().forEach(System.out::println);
        people.stream()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("******* list of all females  declarative approach (lambda and stream) ************************");

        List<Person> females = people.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        System.out.println("******* list of all female's name  declarative approach (lambda and stream) ************************");

        List<String> femalesName = people.stream()
                .filter(x -> x.getGender().equals(Gender.FEMALE)).map(z -> z.getName())
                .collect(Collectors.toList());
        femalesName.forEach(System.out::println);

        System.out.println(" *****  list of all females imperative approach ************************");

        List<Person> f = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                f.add(person);
            }
        }
        f.forEach(System.out::println);

        System.out.println("************* using sorted method,  sort by age the name ****************");

        List<Person> sort = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(Collectors.toList());

        sort.forEach(System.out::println);

        System.out.println(("********* using AgeComparator    ************"));

        Collections.sort(people, new AgeComparator());
        people.forEach(System.out::println);

        System.out.println(("********* using NameComparator, sort by name   ************"));

        Collections.sort(people, new NameComparator());
        people.forEach(System.out::println);

        System.out.println(("********* using AgeComparator then NameComparator , reversed  ************"));

        Collections.sort(people, new AgeComparator()
                .thenComparing(new NameComparator()));
        people.forEach(System.out::println);

        System.out.println("********** name starts with A ***********");

        List<Person> startwithA = people.stream()
                .filter(name -> name.getName()
                        .startsWith("A"))
                .collect(Collectors.toList());
        startwithA.forEach(System.out::println);
        System.out.println("**************** flatMap   ******");
        Stream.of(1, 2, 3).flatMap(n -> Stream.of(n, n * n)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(" ********* Stream.iterate() ************");

        Stream.iterate(1L, n -> n + 2)
                .skip(5)
                .limit(5)
                .forEach(System.out::println); // Output : 11 13 15 17 19
        System.out.println(" ********* concat ************");
        List<String> list = Arrays.asList("Red", "Pink", "Black", "Blue", "Brown");
        List<String> list1 = Arrays.asList("Java", "Design Pattern", "Data Structures");
        Stream<String> res = Stream.concat(list.stream(), list1.stream());
        res.forEach(System.out::println);


    }

    private static List<Person> getPeople() {

        Person p1 = new Person("Antonio", 20, Gender.MALE);//7
        Person p2 = new Person("Alina Smith", 33, Gender.FEMALE);//10
        Person p3 = new Person("Helen White", 57, Gender.FEMALE);//10
        Person p4 = new Person("Slex Boz", 33, Gender.MALE);//7
        Person p5 = new Person("Jamie Goa", 99, Gender.MALE);//8
        Person p6 = new Person("Anna Cook", 7, Gender.FEMALE);//8
        Person p7 = new Person("Zelda Brown", 120, Gender.FEMALE);//10

        List<Person> p = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        return p;

    }


}
