package test.service;

import test.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> showList();


    void addEmpoyee(Employee inputInfor);

    boolean remove(String id);

    boolean findId(String id);

    void editEmployee(String id, Employee inputInfor);


    List<Employee> findName(String name);
}
