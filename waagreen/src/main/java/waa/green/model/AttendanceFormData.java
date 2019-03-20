package waa.green.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

public class AttendanceFormData {
    @JsonIgnore
    private MultipartFile file;
    @JsonIgnore
    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}