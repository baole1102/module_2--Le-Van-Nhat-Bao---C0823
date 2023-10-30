package case_study.controller;

import case_study.model.Employee;
import case_study.service.EmployeeService;
import case_study.service.IEmployeeService;

import java.util.List;

public class EmployeeController {
    IEmployeeService iEmployeeService = new EmployeeService();
    public List<Employee> showList() {
        return iEmployeeService.showList();
    }

    public void addEmployee(Employee employee) {
        iEmployeeService.addEmployee(employee);
    }

    public Boolean remove(int id) {
        return iEmployeeService.remove(id);
    }

    public Employee findName(String name) {
       return iEmployeeService.findName(name);
    }

    public Employee findId(int id) {
        return iEmployeeService.findId(id);
    }

    public void editEmployee(int id, Employee employee) {
        iEmployeeService.editEmployee(id,employee);
    }
}
