package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> showList();

    void addEmployee(Employee employee);

    void remove(int id);

    Employee findId(int id);

    Employee findName(String name);

    void editEmployee(int id, Employee employee);
}
