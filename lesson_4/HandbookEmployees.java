package ru.JDKitHW.lesson_4;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class HandbookEmployees {
    private List<Employee> employees;

    public HandbookEmployees() {
        this.employees = new ArrayList<>();
    }

    // Метод, который ищет сотрудника по стажу
    public List<Employee> searchesEmployeeExperience(String experience) {
        return employees.stream().filter(o -> o.getExperience().equals(experience)).collect(Collectors.toList());
    /*    for (Employee employee : employees) {
            if (employee.getExperience().equals(experience)) {
                return employee.getName();
            }
        }
        return null;
        */

    }

    ;

    // Метод, который выводит номер телефона сотрудника по имени
    public List<String> outputPhoneByName(String name) {
        List<String> lst = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                lst.add(employee.getPhoneNumber());
            }
        }
        return lst;
    }

    ;

    // Метод, который ищет сотрудника по табельному номеру
    public String findEmployeeByServiceNumber(int ServiceNumber) {
        for (Employee employee : employees) {
            if (employee.getServiceNumber() == ServiceNumber) {
                return employee.getName();
            }
        }
        return null;
    }

    ;

    // Метод добавление нового сотрудника в справочник сотрудников
    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

    ;

    @Override
    public String toString() {
        return "HandbookEmployees{" + "employees=" + employees + '}';
    }
}
