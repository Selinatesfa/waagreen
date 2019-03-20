package waa.green.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Attendance;
import waa.green.repository.AttendanceRepository;
import waa.green.model.Student;
import waa.green.repository.StudentRepository;
import waa.green.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	AttendanceRepository attendacerepositort;
	@Override
	public List<Attendance> generatereportbyblock(String studentid,String block) {

		return attendacerepositort.generatereportbyblock(studentid,block);
	}
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student getStudentByCode(String code) {
        return studentRepository.getByCodeBarcode(code);
    }

    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return studentRepository.getStudentByFirstNameAndLastName(firstName,lastName);
    }

}
