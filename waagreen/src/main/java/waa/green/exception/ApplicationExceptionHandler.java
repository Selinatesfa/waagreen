package waa.green.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationExceptionHandler {
	

    @ExceptionHandler(pagenotfound.class)
      public String accessDenied() {
        return  "pagenotfound" ;
    }
}
