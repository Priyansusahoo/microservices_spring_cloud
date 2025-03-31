package com.bluecomet.accounts.model.exchange;

import lombok.Data;

@Data
public class ResponseEXG {
	
	private String statusCode;
	
	private String statusMsg;
	
	
	
	
	
	public ResponseEXG(String statusCode, String statusMsg) {
		super();
		this.statusCode = statusCode;
		this.statusMsg = statusMsg;
	}

}
