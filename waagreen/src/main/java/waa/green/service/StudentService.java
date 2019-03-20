package waa.green.service;

import java.util.List;
import org.springframework.stereotype.Service;
import waa.green.model.Student;
import waa.green.model.Attendance;

@Service
public interface StudentService {
	public List<Attendance> generatereportbyblock(String studentid,String block);
    Student getStudentByCode(String code);
    Student getStudentByFirstNameAndLastName(String firstName, String lastName);
}