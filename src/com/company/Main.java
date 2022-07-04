package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Кот Федя", 35000, 1);
        staff[1] = new Employee("Кот Тимофей", 34500, 1);
        staff[2] = new Employee("Кот Барсик", 33000, 1);
        staff[3] = new Employee("Кошка Даша", 37100, 2);
        staff[4] = new Employee("Кошка Клёпа", 29300, 2);
        staff[5] = new Employee("Кошка Багира", 31100, 3);
        staff[6] = new Employee("Кошка Люся", 52000, 4);
        staff[7] = new Employee("Кот Марк Шагал", 27700, 4);
        staff[8] = new Employee("Кот Джек", 39000, 5);
        staff[9] = new Employee("Кошка Джинни", 34000, 5);


        System.out.println(Arrays.toString(staff));
        sum(staff);
        salaryCounter(staff);
        nameService(staff);

    }

    public static void sum(Employee[] employee) {
        int amount = 0;
        for (int i = 0; i < employee.length; i++) {
            amount += employee[i].getSalary();
            if (i == employee.length - 1) {
                System.out.print(employee[i].getSalary());
            } else {
                System.out.print(employee[i].getSalary() + " + ");
            }
        }
        float amountAverage = amount/10F;
        System.out.println();
        System.out.println("Сумма трат на зарплаты за месяц составила " + amount + " рублей");
        System.out.println("Средняя зарплата составила " + amountAverage + " рублей");
        System.out.println();
    }


    public static void salaryCounter(Employee[] employee) {
        int minNumber = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minNumber) {
                minNumber = employee[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата составила = " + minNumber + " рублей");
        int maxNumber = employee[employee.length-1].getSalary();
        for (int i = employee.length - 1; i >= 0; i--) {
            if (employee[i].getSalary() > maxNumber) {
                maxNumber = employee[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата составила = " + maxNumber + " рублей");
        System.out.println();
    }

    public static void nameService(Employee[] employee) {
        System.out.println("Имена всех сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName());
        }
    }
}

