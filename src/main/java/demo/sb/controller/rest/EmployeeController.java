package demo.sb.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.sb.model.Employee;
import demo.sb.service.EmployeeService;

/**
 * 
 * @author NIYAS 
 * REST Controller class to do CRUD operations
 *
 */

@Component
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	/**
	 * POST method to create an employee . Accepts an Employee object as a json
	 * string , returns the created employee object as json string
	 * 
	 * @param emp
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public Employee createEmployee(@RequestBody Employee emp) {
		return this.service.addEmployee(emp);
	}

	/**
	 * GET method to return an Employee object based on employee id . Accepts
	 * emp id as parameter and returns Employee object as json string
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	public Employee getEmployee(@PathVariable("id") Long id) {
		return this.service.findEmployee(id);
	}

	/**
	 * PUT method to update an Employee . Accepts an Employee object with the
	 * modified values and employee id as parameters , returns the modified
	 * Employee object
	 * 
	 * @param emp
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = { "application/json",
			"application/xml" })
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable("id") Long id) {
		Employee employee = this.service.findEmployee(id);
		employee.setName(emp.getName());
		employee.setAge(emp.getAge());
		return this.service.modifyEmployee(employee);
	}

	/**
	 * DETETE method to delete and Employee. Accepts emp id as parameter
	 * 
	 * @param id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") Long id) {
		this.service.removeEmployee(id);
	}
}
