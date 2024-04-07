package ru.JDKitHW.lesson_4;


public class Program {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "123", "Java", "10");
        Employee employee2 = new Employee(2, "3456", "Anna", "5");
        Employee employee3 = new Employee(3, "124123", "Kristi", "12");
        Employee employee4 = new Employee(4, "9999", "Ivan", "12");

// list -> collection -> hashmap k phone v object


        HandbookEmployees handbook = new HandbookEmployees();
        handbook.addNewEmployee(employee2);
        handbook.addNewEmployee(employee3);
        handbook.addNewEmployee(employee1);
        handbook.addNewEmployee(employee4);

        System.out.println(handbook.findEmployeeByServiceNumber(1));
        System.out.println(handbook.outputPhoneByName("Anna"));
//        System.out.println(handbook.searchesEmployeeExperience("12"));
        handbook.searchesEmployeeExperience("12").forEach(System.out::println);

    }

}
