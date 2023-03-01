package skypro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import skypro.entity.Employee;
import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
}