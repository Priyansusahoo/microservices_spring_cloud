package com.bluecomet.accounts.model.exchange;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ErrorResponseEXG {

	private String apiPath;
	
	private HttpStatus errorCode;
	
	private String errorMsg;
	
	private LocalDateTime errorTime;
	
	
	
	
	
	public ErrorResponseEXG(String apiPath, HttpStatus errorCode, String errorMsg, LocalDateTime errorTime) {
		super();
		this.apiPath = apiPath;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorTime = errorTime;
	}
}
