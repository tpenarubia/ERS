package org.sofgen.ers.controller;

import java.text.ParseException;

import org.sofgen.ers.controller.form.EmployeeDetailForm;
import org.sofgen.ers.dataobject.ResponseResult;
import org.sofgen.ers.model.Employee;
import org.sofgen.ers.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/record")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	private static final String VIEW_EMPLOYEE_PAGE= "record/employee";
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView view(){
	   ModelAndView  modelAndView = new ModelAndView(VIEW_EMPLOYEE_PAGE);
	   modelAndView.addObject("employeeList", employeeService.getEmployeeList());
	   modelAndView.addObject("employeeDetailForm", new EmployeeDetailForm());
	   return modelAndView;
	}
	
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public @ResponseBody ResponseResult saveEmployee(@ModelAttribute(value="employeeDetailForm") EmployeeDetailForm employeeDetailForm) throws ParseException {
		
		ResponseResult responseResult = new ResponseResult();
		
		Employee employee = employeeService.addEmployee(employeeDetailForm.getEmpId(), employeeDetailForm.getTitle(),
				employeeDetailForm.getSurname(), employeeDetailForm.getFirstname(), employeeDetailForm.getOthername(),
				employeeDetailForm.getPreviousname(), employeeDetailForm.getNationalInsuranceNo(), employeeDetailForm.getInitials(), 
				employeeDetailForm.getKnownAs(), employeeDetailForm.getCurrentPosition(), employeeDetailForm.getHiearchyLocation(),
				employeeDetailForm.getAge(), employeeDetailForm.getLengthOfService(), employeeDetailForm.getPassportNumber(), 
				employeeDetailForm.getStartDate(), employeeDetailForm.getContServiceDate(), employeeDetailForm.getDateOfBirth(),
				employeeDetailForm.getNationality(), employeeDetailForm.getReligion(), employeeDetailForm.getNameChangedDate(), 
				employeeDetailForm.getMaritalStatus(), employeeDetailForm.getGender(), employeeDetailForm.getMobilePhone(), 
				employeeDetailForm.getWorkEmail());
		
		if(employee.getId() > 0){
			responseResult.setResponseCode(ResponseResult.RESPONSE_CODE_SUCCESS);
		}
		
		return responseResult;
		
	}
}
