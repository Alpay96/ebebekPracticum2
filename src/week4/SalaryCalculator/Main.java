package week4.SalaryCalculator;

public class Main {
    public static void main (String[] args) {

        Employee employee1 = new Employee("Alpay Ustalar", 14000, 60, 2013);
        Employee employee2 = new Employee("Tolga Donmez", 16000, 40, 2015);
        Employee employee3 = new Employee("Samet Sahin", 36000, 50, 2008);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }
}
