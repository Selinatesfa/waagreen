package waa.green.service;

import java.util.List;
import org.springframework.stereotype.Service;
import waa.green.model.Student;
import waa.green.model.StudentReportDate;
import waa.green.model.Attendance;
import waa.green.model.PercentageExtrapoint;

@Service
public interface StudentService {
	public List<Attendance> generatereportbyblock(Long studentid,String block);
    Student getStudentByCode(String code);
    Student getStudentByFirstNameAndLastName(String firstName, String lastName);
    public Student findByEmail(String email);
    public StudentReportDate calculateextrapoints(List<Attendance> attendance);
}