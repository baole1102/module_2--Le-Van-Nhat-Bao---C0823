package case_study.service;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> showList();

    void addEmployee(Employee employee);


    Employee findName(String name);

    boolean findId(String id);

    void editEmployee(String id, Employee employee);

    Boolean remove(String id);
}
