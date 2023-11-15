package a.reponsibility;

import a.module.Employee;
import a.until.ReadandWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeReponsibility implements IEmployeeReponsibility {
    private static final List<Employee> employees = ReadandWrite.readFile();

    @Override
    public List<Employee> showList() {
        return employees;
    }

    @Override
    public boolean findId(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        ReadandWrite.writeFile(employees);
    }

    @Override
    public void remove(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employees.remove(employee);
                break;
            }
        }
        ReadandWrite.writeFile(employees);
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        for (Employee employee1 : employees){
            if (employee1.getId().equals(id)){
                employee1.setId(id);
                employee1.setName(employee.getName());
                employee1.setLocation(employee.getLocation());
                employee1.setDay(employee.getDay());
                employee1.setSaraly(employee.getSaraly());
                break;
            }
        }
        ReadandWrite.writeFile(employees);
    }
    @Override
    public List<Employee> findName(String name) {
        List<Employee> employees1 = new ArrayList<>();
        for (Employee employee : employees){
            if (employee.getName().toLowerCase().contains(name.toLowerCase())){
                employees1.add(employee);
            }
        }
        return employees1;
    }
}
