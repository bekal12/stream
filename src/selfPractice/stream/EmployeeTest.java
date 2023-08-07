package selfPractice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee("ancd",20,1000,"hr");
        Employee e2 = new Employee("vbn",25,2000,"it");
        Employee e3 = new Employee("tyu",26,3000,"hr");
        Employee e4 = new Employee("qwd",30,4000,"sales");
        Employee e5 = new Employee("mokl",22,5000,"it");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).forEach((department, averageSalary) ->
                System.out.println("Average salary in " + department + " department: " + averageSalary));

        Map<String, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName, employee -> employee));
        System.out.println("map :  = " + employeeMap);

        List<Double> emp = employees.stream().filter(e -> e.getAge() > 25).map(e -> e.getSalary() * 1.1).collect(Collectors.toList());
        //employees.stream().filter(e -> e.getAge() > 25).map(e -> e.getSalary() * 1.1).collect(Collectors.toList()).forEach(System.out::println);
        //System.out.println(employees);
       // System.out.println(emp);
        List<Employee> emp1 = employees.stream().map(e -> {
            if(e.getAge() > 25) {
                e.setSalary(e.getSalary() * 1.10);
            }
            return e;
        }).collect(Collectors.toList());
        System.out.println(emp1);

        String str1 = "Abc"; // string litral stored in constant pool
        String str2 = "abc";
        String str3 = "Abc";
        String str4 = new String("abc"); // using keyword new stored in the heap

        System.out.println(str1 == str2); // false  We can use == operators for reference comparison (address comparison) and
        // .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas
        // .equals() evaluates to the comparison of values in the objects.
        System.out.println(str1 == str3); //true
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); //true

//**********************************************



//                Map<String, Double> averageSalariesByDepartment = calculateAverageSalaryByDepartment(employees);
//
//                // Print the average salary for each department
//                averageSalariesByDepartment.forEach((department, averageSalary) ->
//                        System.out.println("Average salary in " + department + " department: " + averageSalary));
//
//
//            public static Map<String, Double> calculateAverageSalaryByDepartment(List<Employee> employees) {
//                return employees.stream()
//                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));








    }
}
