package com.bluecomet.accounts.model.exchange;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseEXG {

	private String apiPath;
	
	private HttpStatus errorCode;
	
	private String errorMsg;
	
	private LocalDateTime errorTime;
}
