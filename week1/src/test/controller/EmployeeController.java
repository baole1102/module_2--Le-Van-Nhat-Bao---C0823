package test.controller;

import test.model.Employee;
import test.service.EmployeeService;
import test.service.IEmployeeService;

import java.util.List;

public class EmployeeController {
    private IEmployeeService iEmployeeService = new EmployeeService();

    public List<Employee> showList() {
        return  iEmployeeService.showList();
    }



    public void addEmployee(Employee inputInfor) {
        iEmployeeService.addEmpoyee(inputInfor);
    }

    public boolean remove(String id) {
        return iEmployeeService.remove(id);
    }

    public boolean findId(String id) {
        return iEmployeeService.findId(id);
    }

    public void editEmployee(String id, Employee inputInfor) {
        iEmployeeService.editEmployee(id,inputInfor);

    }


    public List<Employee> findName(String name) {
      return   iEmployeeService.findName(name);
    }
}
