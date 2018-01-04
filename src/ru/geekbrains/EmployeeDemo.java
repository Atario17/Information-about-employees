package ru.geekbrains;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0]=new Employee("Снежинский Дмитрий Евгеньевич", "Junior Java Developer",
                "snejkov@gmail.com", "89107433134", 35000, 23 );
        employee[1]=new Employee("Хорьков Владлен Александрович", "Web designer",
                "horek@mail.ru", "89105493735", 60000, 41 );
        employee[2]=new Employee("Бурак Дарья Васильевна", "Middle Java Developer",
                "sova0_0@yandex.ru", "89641400357", 70000, 24 );
        employee[3]=new Employee("Макаров Илья Петрович", "Software Tester",
                "makar@gmail.com", "89035174587", 25000, 31 );
        employee[4]=new Employee("Щербин Олег Михайлович", "Senior Android Developer",
                "i'm_the_boss@gmail.com", "89107433134", 150000, 43 );

        for (int i = 0; i < employee.length ; i++) {
            if(employee[i].getAge()>40){
                employee[i].info();
            }
        }
    }
}

