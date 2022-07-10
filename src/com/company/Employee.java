package com.company;

public class Employee {
    private String name;
    private int salary;
    private int department;
    private int id;
    private static int counter;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "ФИО - " + name + ", зарплата - " +
                salary + ", отдел - " +
                department + ", id = " +
                id + ";" + System.lineSeparator();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }


    public static int getCounter() {
        return counter;
    }

}
