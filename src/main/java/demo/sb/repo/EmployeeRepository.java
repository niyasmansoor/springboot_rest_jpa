package demo.sb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.sb.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
