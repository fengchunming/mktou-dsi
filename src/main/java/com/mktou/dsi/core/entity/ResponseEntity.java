package com.mktou.dsi.core.entity;

public class ResponseEntity {

	private String returnCode; // SUCCESS/FAIL
	private String returnMsg; // 返回信息，如非空，为错误原因
	private Object returnData; // //返回数据

	public ResponseEntity() {
		super();
	}

	public ResponseEntity(String returnCode, String returnMsg, Object returnData) {
		super();
		this.returnCode = returnCode;
		this.returnMsg = returnMsg;
		this.returnData = returnData;
	}
	
	public static ResponseEntity success(String returnMsg, Object returnData) {
		ResponseEntity re = new ResponseEntity("SUCCESS", returnMsg, returnData);
		re.returnMsg = returnMsg;
		re.returnData = returnData;
		return re;
	}
	
	public static ResponseEntity fail(String returnMsg, Object returnData) {
		ResponseEntity re = new ResponseEntity("FAIL", returnMsg, returnData);
		re.returnMsg = returnMsg;
		re.returnData = returnData;
		return re;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public Object getReturnData() {
		return returnData;
	}

	public void setReturnData(Object returnData) {
		this.returnData = returnData;
	}

}
