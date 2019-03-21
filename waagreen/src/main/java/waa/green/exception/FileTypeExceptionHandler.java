package waa.green.exception;

import org.springframework.validation.BindingResult;

public class FileTypeExceptionHandler extends RuntimeException {
    private String message;
    private BindingResult bindingResult;

    public FileTypeExceptionHandler(String message) {
        this.message = message;
    }

    public FileTypeExceptionHandler(BindingResult bindingResult) {
        System.out.println("FileTypeExceptionHandler");
        this.bindingResult = bindingResult;
    }

    public BindingResult getBindingResult() {
        return bindingResult;
    }

    public void setBindingResult(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
