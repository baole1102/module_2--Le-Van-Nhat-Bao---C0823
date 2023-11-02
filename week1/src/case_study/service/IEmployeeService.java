package case_study.service;

import case_study.model.modulePerson.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> showList();

    void addEmployee(Employee employee);


    List<Employee> findName(String name);

    boolean findId(String id);

    void editEmployee(String id, Employee employee);

    Boolean remove(String id);
}
