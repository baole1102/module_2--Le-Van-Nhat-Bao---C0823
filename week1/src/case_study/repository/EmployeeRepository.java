package case_study.repository;

import case_study.model.modulePerson.Employee;
import case_study.untils.readandWriteEmployee.DocFile;
import case_study.untils.readandWriteEmployee.ReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employees = ReadFile.readFile();

    @Override
    public List<Employee> showList() {
        return ReadFile.readFile();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees = ReadFile.readFile();
        employees.add(employee);
        DocFile.writeFile(employees);
    }

    @Override
    public void remove(String id) {
        employees = ReadFile.readFile();
        for (Employee employee : employees) {
            if (Objects.equals(employee.getCode(), id)) {
                employees.remove(employee);
                break;
            }
        }
        DocFile.writeFile(employees);
    }

    @Override
    public boolean findId(String id) {
        for (Employee employee : employees) {
            if (employee.getCode().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> findName(String name) {
        employees = ReadFile.readFile();
        List<Employee> employees1 = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().contains(name.toLowerCase())) {
                 employees1.add(employee);
            }
        }
        return employees1;
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        for (Employee employee1 : employees) {
            if (Objects.equals(employee1.getCode(), id)) {
                employee1.setName(employee.getName());
                employee1.setDate(employee.getDate());
                employee1.setEmail(employee.getEmail());
                employee1.setGender(employee.getGender());
                employee1.setLevel(employee.getLevel());
                employee1.setIdentify(employee.getIdentify());
                employee1.setPosition(employee.getPosition());
                employee1.setSalary(employee.getSalary());
                employee1.setNumber(employee.getNumber());
                break;
            }
        }
        DocFile.writeFile(employees);
    }
}
