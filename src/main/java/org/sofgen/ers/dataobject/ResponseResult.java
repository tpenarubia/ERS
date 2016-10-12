package org.sofgen.ers.dataobject;

import java.io.Serializable;

public class ResponseResult implements Serializable {

	private static final long serialVersionUID = -4520227867005845362L;
	
	public static final String RESPONSE_CODE_SUCCESS = "OK";
	public static final String RESPONSE_CODE_ERROR = "ERROR";

	private String responseCode;
	private String responseMsg;
	private Object responseObject;
	
	public ResponseResult(){
		this.responseCode = RESPONSE_CODE_ERROR;
		this.responseMsg = "";
		this.responseObject = null;
	}
	
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	/**
	 * @return the responseMsg
	 */
	public String getResponseMsg() {
		return responseMsg;
	}
	
	/**
	 * @param responseMsg the responseMsg to set
	 */
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	
	/**
	 * @return the responseObject
	 */
	public Object getResponseObject() {
		return responseObject;
	}
	
	/**
	 * @param responseObject the responseObject to set
	 */
	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}	
}
