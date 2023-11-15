package test.responsibility;

import test.model.Employee;
import test.until.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    private List<Employee> employees = ReadAndWriteFile.readFile();

    @Override
    public List<Employee> showList() {
        return employees;
    }
    @Override
    public void addEmployee(Employee inputInfor) {
        employees.add(inputInfor);
        ReadAndWriteFile.writeFile(employees);
    }

    @Override
    public boolean findId(String id) {
        for (Employee employee : employees){
            if (employee.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(String id) {
        for (Employee employee: employees){
            if (employee.getId().equals(id)){
                employees.remove(employee);
                break;
            }
        }
        ReadAndWriteFile.writeFile(employees);
    }

    @Override
    public void editEmployee(String id, Employee inputInfor) {
        for (Employee employee: employees){
            if (employee.getId().equals(id)){
                employee.setId(id);
                employee.setName(inputInfor.getName());
                employee.setLocation(inputInfor.getLocation());
                employee.setLevel(inputInfor.getLevel());
                employee.setSaraly(inputInfor.getSaraly());
                break;
            }
        }
        ReadAndWriteFile.writeFile(employees);
    }

    @Override
    public List<Employee> findName(String name) {
        List<Employee> employees1 = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.getName().toLowerCase().contains(name.toLowerCase())){
                employees1.add(employee);
            }
        }
        return employees1;
    }


}
