package a.service;

import a.module.Employee;
import a.reponsibility.EmployeeReponsibility;
import a.reponsibility.IEmployeeReponsibility;

import java.util.List;

public class EmployeeService implements  IEmployeeService{
    private IEmployeeReponsibility iEmployeeReponsibility = new EmployeeReponsibility();

    @Override
    public List<Employee> showList() {
        return iEmployeeReponsibility.showList();
    }

    @Override
    public boolean findId(String id) {
        return iEmployeeReponsibility.findId(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        iEmployeeReponsibility.addEmployee(employee);
    }

    @Override
    public boolean remove(String id) {
        boolean employee = iEmployeeReponsibility.findId(id);
        if (!employee){
            return false;
        }else {
            iEmployeeReponsibility.remove(id);
            return true;
        }

    }

    @Override
    public void editEmployee(String id, Employee employee) {
        iEmployeeReponsibility.editEmployee(id,employee);
    }

    @Override
    public List<Employee> findName(String name) {
        return iEmployeeReponsibility.findName(name);
    }
}
