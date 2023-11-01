package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    IEmployeeRepository iEmployeeRepository =   new EmployeeRepository();


    @Override
    public List<Employee> showList() {
        return iEmployeeRepository.showList();
    }

    @Override
    public void addEmployee(Employee employee) {
        iEmployeeRepository.addEmployee(employee);
    }


    @Override
    public Boolean remove(String id) {
        boolean employee = iEmployeeRepository.findId(id);
        if (!employee){
            return false;
        }else {
            iEmployeeRepository.remove(id);
            return true;
        }
    }

    @Override
    public Employee findName(String name) {
        return iEmployeeRepository.findName(name);
    }

    @Override
    public boolean findId(String id) {
        return iEmployeeRepository.findId(id);
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        iEmployeeRepository.editEmployee(id,employee);
    }
}
