package waa.green.service;

import java.util.List;

import org.springframework.stereotype.Service;

import waa.green.model.Attendance;
import waa.green.model.Course;
import waa.green.model.Student;

@Service
public interface StudentService {
	public List<Attendance> generatereportbyblock(String studentid,String block);

}
