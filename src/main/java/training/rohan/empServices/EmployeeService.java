package training.rohan.empServices;

import org.springframework.stereotype.Service;

import training.rohan.empModel.Employee;

import java.util.List;

@Service
public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
