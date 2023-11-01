package case_study.repository;

import case_study.model.Employee;
import case_study.untils.DocFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(1, "Bao", "11/02/2001", "Male", 11, 4, "levannhatbao29@gmail.com", "Ki Su", "Top", 2000));
        employees.add(new Employee(2, "Do", "02/05/2002", "Male", 12, 5, "levando@gmail.com", "Student", "Bottom", 1000));
        employees.add(new Employee(3, "Vi", "20/09/2009", "FeMale", 13, 6, "tieuvi@gmail.com", "Student", "Bottom", 3000));
    }

    @Override
    public List<Employee> showList() {
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        DocFile.writeFile(employees);
    }

    @Override
    public void remove(int id) {
        for (Employee employee : employees) {
            if (Objects.equals(employee.getCode(), id)) {
                employees.remove(employee);
                DocFile.writeFile(employees);
                break;
            }
        }
    }

    @Override
    public boolean findId(int id) {
        for (Employee employee : employees) {
            if (employee.getCode() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee findName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().contains(name.toLowerCase())) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void editEmployee(int id, Employee employee) {
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
    }
}
