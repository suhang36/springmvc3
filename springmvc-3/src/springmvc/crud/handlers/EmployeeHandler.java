package springmvc.crud.handlers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.crud.dao.DepartmentDao;
import springmvc.crud.dao.EmployeeDao;

@Controller
public class EmployeeHandler {
	
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/emps")
	public String getAll(Map<String,Object> map) {
		System.out.println(employeeDao.getAll());
		map.put("employees", employeeDao.getAll());
		return "list";
	}
}
