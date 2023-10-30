package case_study.service;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> showList();

    void addEmployee(Employee employee);

    Boolean remove(int id);

    Employee findName(String name);

    Employee findId(int id);

    void editEmployee(int id, Employee employee);
}
