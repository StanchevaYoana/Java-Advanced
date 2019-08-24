package CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Department> employeeMap = new HashMap<>();

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            String email;
            int age;

            Employee emp = new Employee(name, salary, position);
            if (data.length == 5) {
                if (Character.isDigit(data[4].charAt(0))) {
                    emp.setAge(Integer.parseInt(data[4]));
                } else {
                    emp.setEmail(data[4]);
                }
            }
            if (data.length == 6) {
                emp.setEmail(data[4]);
                emp.setAge(Integer.parseInt(data[5]));
            }
            employeeMap.putIfAbsent(department, new Department());
            employeeMap.get(department).addEmployee(emp);
        }

        Map.Entry<String, Department> highestSalary = employeeMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(f -> f.getValue().getAverageSalary()))
                .get();

        System.out.println(String.format("Highest Average Salary: %s", highestSalary.getKey()));
        highestSalary.getValue().getEmployees().stream()
                .sorted((f,s) -> Double.compare(s.getSalary(),f.getSalary()))
                .forEach(employee ->
                        System.out.printf("%s %.2f %s %d%n", employee.getName(),
                                employee.getSalary(),
                                employee.getEmail(),
                                employee.getAge()));

    }
}
