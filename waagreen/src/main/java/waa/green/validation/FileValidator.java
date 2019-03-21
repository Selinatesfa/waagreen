package waa.green.validation;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;
import waa.green.model.AttendanceFormData;

public class FileValidator implements Validator {
    String contentType = "text/plain";
    @Override
    public boolean supports(Class<?> c) {
        return AttendanceFormData.class.isAssignableFrom(c);
    }

    @Override
    public void validate(Object object, Errors errors) {
        AttendanceFormData attendanceFormData = (AttendanceFormData) object;
        for(MultipartFile file : attendanceFormData.getFiles()){
            if(!file.getContentType().equals( contentType))
                errors.rejectValue("contentType", "Content type doesn't match.");
        }
    }
}
