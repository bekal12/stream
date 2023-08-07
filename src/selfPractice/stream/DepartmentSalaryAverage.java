package selfPractice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentSalaryAverage {
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

        Map<String, Double> averageSalariesByDepartment = calculateAverageSalaryByDepartment(employees);

        // Print the average salary for each department
        averageSalariesByDepartment.forEach((department, averageSalary) ->
                System.out.println("Average salary in " + department + " department: " + averageSalary));
    }

    public static Map<String, Double> calculateAverageSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }
}



