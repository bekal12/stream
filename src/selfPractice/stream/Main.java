//package selfPractice.stream;
//
//import java.util.*;
////import java.util.List;
//import java.util.stream.Collectors;
//
//public class Main {
//
//  public static void main(String[] args) {
//    List<Person> people = getPeople();
//
//    // Imperative approach ❌
//
//    /*
//
//    List<Person> females = new ArrayList<>();
//
//    for (Person person : people) {
//
//      if (person.getGender().equals(Gender.FEMALE)) {
//        females.add(person);
//      }
//    }
//
//    females.forEach(System.out::println);
//
//    */
//
//    // Declarative approach ✅
//
//    // Filter
//    List<Person> females = people.stream()
//        .filter(person -> person.getGender().equals(Gender.FEMALE))
//        .collect(Collectors.toList());
//
//    females.forEach(System.out::println);
//
//    // Sort
//    List<Person> sorted = people.stream()
//        .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
//        .collect(Collectors.toList());
//
//    sorted.forEach(System.out::println);
//
//    // All match
//    boolean allMatch = people.stream()
//        .allMatch(person -> person.getAge() > 8);
//
//    System.out.println(allMatch);
//    // Any match
//    boolean anyMatch = people.stream()
//        .anyMatch(person -> person.getAge() > 121);
//
//    System.out.println(anyMatch);
//    // None match
//    boolean noneMatch = people.stream()
//        .noneMatch(person -> person.getName().equals("Antonio"));
//
//    System.out.println(noneMatch);
//
//    // Max
//    people.stream()
//        .max(Comparator.comparing(Person::getAge))
//        .ifPresent(System.out::println);
//
//    // Min
//    people.stream()
//        .min(Comparator.comparing(Person::getAge))
//        .ifPresent(System.out::println);
//
//    // Group
//    Map<Gender, List<Person>> groupByGender = people.stream()
//        .collect(Collectors.groupingBy(Person::getGender));
//
////    groupByGender.forEach((gender, people1) -> {
////      System.out.println(gender);
////      people1.forEach(System.out::println);
////      System.out.println();
////    });
//
//    Optional<String> oldestFemaleAge = people.stream()
//        .filter(person -> person.getGender().equals(Gender.FEMALE))
//        .max(Comparator.comparing(Person::getAge))
//        .map(Person::getName);
//
//    oldestFemaleAge.ifPresent(System.out::println);
//  }
//
//  private static List<Person> getPeople() {
//
//        Person p1 = new Person("Antonio", 20, Gender.MALE);
//        Person p2 = new Person("Alina Smith", 33, Gender.FEMALE);
//        Person p3 = new Person("Helen White", 57, Gender.FEMALE);
//        Person p4 = new Person("Alex Boz", 14, Gender.MALE);
//        Person p5 = new Person("Jamie Goa", 99, Gender.MALE);
//        Person p6 = new Person("Anna Cook", 7, Gender.FEMALE);
//        Person p7 = new Person("Zelda Brown", 120, Gender.FEMALE);
//
//    List<Person> p = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
//
//    return p;
//
//  }
//
//}