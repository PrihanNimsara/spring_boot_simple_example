package com.developer.prihan.SpringBootExample;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
@EnableAutoConfiguration
public class EmployeeController {
//	@RequestMapping("/")
//    public List getEmployees()
//    {
//      List employeesList = (List) new ArrayList<Employee>();
//      employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
//      return employeesList;
//    }
	 @RequestMapping("/")
	    String hello() {
	        return "Hello World! JavaInterviewPoint";
	    }
}
