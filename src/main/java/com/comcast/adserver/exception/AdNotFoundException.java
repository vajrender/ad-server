package com.comcast.adserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Ad does not exists")
public class AdNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	

}
