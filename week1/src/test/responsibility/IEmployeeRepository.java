package test.responsibility;

import test.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> showList();


    void addEmployee(Employee inputInfor);

    boolean findId(String id);

    void remove(String id);

    void editEmployee(String id, Employee inputInfor);


    List<Employee> findName(String name);
}
