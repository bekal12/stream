package selfPractice.stream;

public class Person implements Comparable<Person> {

  private final String name;
  private final int age;
  private final Gender gender;

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", gender=" + gender +
        '}';
  }

  @Override
  public int compareTo(Person o) {
    if(this.name == o.name) return 0;
    else if(this.name.length() < o.name.length()) return -1;
    return 1;
  }
}