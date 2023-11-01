package case_study.controller;

import case_study.model.Employee;
import case_study.service.EmployeeService;
import case_study.service.IEmployeeService;

import java.util.List;

public class EmployeeController {
   private IEmployeeService iEmployeeService = new EmployeeService();
    public List<Employee> showList() {
        return iEmployeeService.showList();
    }

    public void addEmployee(Employee employee) {
        iEmployeeService.addEmployee(employee);
    }

    public Boolean remove(String id) {
        return iEmployeeService.remove(id);
    }

    public Employee findName(String name) {
       return iEmployeeService.findName(name);
    }

    public boolean findId(String id) {
       return   iEmployeeService.findId(id);
    }

    public void editEmployee(String id, Employee employee) {
        iEmployeeService.editEmployee(id,employee);
    }
}
