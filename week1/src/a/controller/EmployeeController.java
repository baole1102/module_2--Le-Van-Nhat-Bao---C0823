package a.controller;

import a.module.Employee;
import a.service.EmployeeService;
import a.service.IEmployeeService;

import java.util.List;

public class EmployeeController {
    private IEmployeeService iEmployeeService = new EmployeeService();

    public List<Employee> showList() {
        return iEmployeeService.showList();
    }

    public boolean findId(String id) {
        return iEmployeeService.findId(id);
    }

    public void addEmployee(Employee employee) {
        iEmployeeService.addEmployee(employee);
    }

    public boolean remove(String id) {
        return iEmployeeService.remove(id);
    }

    public void editEmployee(String id, Employee employee) {
        iEmployeeService.editEmployee(id,employee);
    }

    public List<Employee> findName(String name) {
        return iEmployeeService.findName(name);
    }
}
