package demo.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.sb.model.Employee;
import demo.sb.repo.EmployeeRepository;

/**
 * 
 * @author NIYAS
 * Service class to do add/get/update and delete an employee
 *
 */
@Service
public class EmployeeService {

	// jpa repository to do CRUD operations on Employee object
	@Autowired
	private EmployeeRepository repo;

	public EmployeeService() {

	}
	
	/**
	 * Service method to add an employee . Accepts Employee object and returns the created Employee object
	 * @param emp
	 * @return 
	 */
	public Employee addEmployee(Employee emp) {
		return repo.save(emp);
	}

	/**
	 * Service method to find an employee . Accepts employee id and returns the found Employee object
	 * @param id
	 * @return
	 */
	public Employee findEmployee(long id) {
		return repo.findOne(id);
	}

	/**
	 * Service method to update an employee . Accepts Employee object and employee id and returns the modified Employee object
	 * @param emp
	 * @return
	 */
	public Employee modifyEmployee(Employee emp) {
		return repo.save(emp);
	}

	/**
	 * Service method to delete an employee . Accepts employee id
	 * @param id
	 */
	public void removeEmployee(long id) {
		repo.delete(id);
	}

}
