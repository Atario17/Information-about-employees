package ru.geekbrains;
/*
* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String post, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void setAge(int age) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Full name: " + fullName + "\n" + "Post: " + post +
                "\n" + "Email: " + email + "\n" + "Phone number: " + phoneNumber +
                "\n" + "Salary: " + salary + "\n" + "Age: " + age + "\n");
    }
}
