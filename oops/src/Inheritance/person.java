package Inheritance;
import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double salary;
    private int year;
    private String insuranceNumber;

    public Employee(String name, double salary, int year, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        int year = sc.nextInt();
        sc.nextLine();
        String insuranceNumber = sc.nextLine();

        Employee emp = new Employee(name, salary, year, insuranceNumber);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Year: " + emp.getYear());
        System.out.println("Insurance Number: " + emp.getInsuranceNumber());
    }
}
