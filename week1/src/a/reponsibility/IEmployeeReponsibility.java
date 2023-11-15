package a.reponsibility;

import a.module.Employee;

import java.util.List;

public interface IEmployeeReponsibility {
    List<Employee> showList();

    boolean findId(String id);

    void addEmployee(Employee employee);

    void remove(String id);

    void editEmployee(String id, Employee employee);

    List<Employee> findName(String name);
}
