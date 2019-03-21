package waa.green.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =HttpStatus.NOT_FOUND, reason = "the requested page can not be found")
public class pagenotfound extends RuntimeException {
	
	private String message;
	public pagenotfound() {}
	public pagenotfound(String message) {
		this.message=message;
	}
		
	}
