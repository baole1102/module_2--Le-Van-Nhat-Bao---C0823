package a.service;

import a.module.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> showList();

    boolean findId(String id);

    void addEmployee(Employee employee);

    boolean remove(String id);

    void editEmployee(String id, Employee employee);

    List<Employee> findName(String name);
}
