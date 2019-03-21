package waa.green.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.thymeleaf.exceptions.TemplateInputException;
import waa.green.model.dto.DomainError;
import waa.green.model.dto.DomainErrors;

import java.util.List;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(pagenotfound.class)
    public String accessDenied() {
        return "pagenotfound";
    }

    @ExceptionHandler(FileTypeExceptionHandler.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public DomainErrors fileTypeException(FileTypeExceptionHandler exceptionHandler){
        List<FieldError> fieldErrors = exceptionHandler.getBindingResult().getFieldErrors();

        DomainErrors errors = new DomainErrors();
        errors.setErrorType("FileError");
        errors.addError(new DomainError("Content type doesn't match."));
        return errors;
    }


    @ExceptionHandler(TemplateInputException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public DomainErrors templateInputException(){
        DomainErrors errors = new DomainErrors();
        errors.setErrorType("FileError");
        errors.addError(new DomainError("Content type doesn't match."));
        return errors;
    }
}
