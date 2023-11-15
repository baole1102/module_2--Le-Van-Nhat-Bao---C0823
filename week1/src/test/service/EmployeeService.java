package test.service;

import test.model.Employee;
import test.responsibility.EmployeeRepository;
import test.responsibility.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> showList() {
        return iEmployeeRepository.showList();
    }



    @Override
    public void addEmpoyee(Employee inputInfor) {
        iEmployeeRepository.addEmployee(inputInfor);
    }

    @Override
    public boolean remove(String id) {
        boolean employee = iEmployeeRepository.findId(id);
        if (!employee){
            return false;
        }else {
            iEmployeeRepository.remove(id);
            return  true;
        }

    }

    @Override
    public boolean findId(String id) {
        return iEmployeeRepository.findId(id);
    }

    @Override
    public void editEmployee(String id, Employee inputInfor) {
        iEmployeeRepository.editEmployee(id,inputInfor);
    }

    @Override
    public List<Employee> findName(String name) {
        return  iEmployeeRepository.findName(name);
    }


}
