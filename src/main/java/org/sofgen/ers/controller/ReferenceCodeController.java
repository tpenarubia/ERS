package org.sofgen.ers.controller;

import java.text.ParseException;
import java.util.Locale;

import org.sofgen.ers.controller.form.EmployeeDetailForm;
import org.sofgen.ers.controller.form.ReferenceCodeDetailForm;
import org.sofgen.ers.dataobject.ERSConstants;
import org.sofgen.ers.dataobject.ResponseResult;
import org.sofgen.ers.service.ReferenceCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.sofgen.ers.model.ReferenceCode;
import org.sofgen.ers.model.SearchResult;

@Controller
@RequestMapping("/reference")
public class ReferenceCodeController {
    @Autowired
	private ReferenceCodeService referenceCodeService;
    
    @Autowired
	private MessageSource messageSource;
	
	private static final String VIEW_REFERENCE_CODES_PAGE= "reference/codes";
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/codes/search", method = RequestMethod.POST)
	public @ResponseBody SearchResult<ReferenceCode> searchResults(int fetchSize, int page){
		return referenceCodeService.getSearchResults(null, fetchSize, page);
	}
	@RequestMapping(value="/codes", method= RequestMethod.GET)
	public ModelAndView view() {
		ModelAndView modelAndView = new ModelAndView(VIEW_REFERENCE_CODES_PAGE);
		modelAndView.addObject("referenceCodeList",referenceCodeService.getReferenceCodeList());
		modelAndView.addObject("keyListDistinct",referenceCodeService.getDistinctKeyList());
		modelAndView.addObject("referenceCodeDetailForm", new ReferenceCodeDetailForm());
		return modelAndView;
	}
	
	@RequestMapping(value="codes/add", method = RequestMethod.POST)
	public @ResponseBody ResponseResult saveReferenceCode(@ModelAttribute(value="referenceCodeDetailForm") ReferenceCodeDetailForm referenceCodeDetailForm) throws ParseException  {
		ResponseResult responseResult = new ResponseResult();
		ReferenceCode referenceCode = referenceCodeService.addReferenceCode(referenceCodeDetailForm.getKey(), referenceCodeDetailForm.getValue(), referenceCodeDetailForm.getDescription());
	    
		if(referenceCode.getId()>0){
			responseResult.setResponseCode(ResponseResult.RESPONSE_CODE_SUCCESS);
			responseResult.setResponseMsg(
					messageSource.getMessage(
						 ERSConstants.MSG_SUCCESS_ADD_REFERENCE_CODE, 
						 null, 
						 Locale.getDefault()));
		}else{
			responseResult.setResponseMsg(
					messageSource.getMessage(
							ERSConstants.MSG_ERROR_ADD_REFERENCE_CODE, 
							null, 
							Locale.getDefault()));
		}
		
		return responseResult;
	}
	
	@RequestMapping(value="codes/delete", method = RequestMethod.POST)
	public @ResponseBody ResponseResult deleteReferenceCode(@RequestParam(value="id", required = true)Long id )  {
		ResponseResult responseResult = new ResponseResult();
		boolean deleted = referenceCodeService.deleteReferenceCode(id);
	    
		if (deleted){
			responseResult.setResponseCode(ResponseResult.RESPONSE_CODE_SUCCESS);
			responseResult.setResponseMsg(
					messageSource.getMessage(
							ERSConstants.MSG_SUCCESS_DELETE_REFERENCE_CODE, 
							null, 
							Locale.getDefault()));
		}
		else{
			responseResult.setResponseMsg(
					messageSource.getMessage(
							ERSConstants.MSG_ERROR_DELETE_REFERENCE_CODE, 
							null, 
							Locale.getDefault()));
		}
		
		return responseResult;
	}
	
	@RequestMapping(value="codes/update", method = RequestMethod.POST)
	public @ResponseBody ResponseResult updateReferenceCode(@ModelAttribute(value="referenceCodeDetailForm")ReferenceCodeDetailForm referenceCodeDetailForm ) throws ParseException {
		ResponseResult responseResult = new ResponseResult();
		ReferenceCode referenceCode = referenceCodeService.updateReferenceCode(referenceCodeDetailForm.getKey(), referenceCodeDetailForm.getValue(), referenceCodeDetailForm.getDescription());
	    
		if (referenceCode != null){
			responseResult.setResponseCode(ResponseResult.RESPONSE_CODE_SUCCESS);
			responseResult.setResponseMsg(
					messageSource.getMessage(
							ERSConstants.MSG_SUCCESS_UPDATE_REFERENCE_CODE, 
							null, 
							Locale.getDefault()));
		}
		else{
			responseResult.setResponseMsg(
					messageSource.getMessage(
							ERSConstants.MSG_ERROR_UPDATE_REFERENCE_CODE, 
							null, 
							Locale.getDefault()));
		}
		
		return responseResult;
	}	
	
}
