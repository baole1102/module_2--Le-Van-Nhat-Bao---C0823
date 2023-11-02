package case_study.repository;

import case_study.model.modulePerson.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> showList();

    void addEmployee(Employee employee);

    void remove(String id);

    boolean findId(String id);

    List<Employee> findName(String name);

    void editEmployee(String id, Employee employee);
}
