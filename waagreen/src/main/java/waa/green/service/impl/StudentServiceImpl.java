package waa.green.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Attendance;
import waa.green.model.PercentageExtrapoint;
import waa.green.repository.AttendanceRepository;
import waa.green.model.Student;
import waa.green.model.StudentReportDate;
import waa.green.repository.StudentRepository;
import waa.green.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	AttendanceRepository attendacerepositort;
	@Autowired
	StudentRepository studentservice;
	@Override
	public List<Attendance> generatereportbyblock(Long studentid,String block) {

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

	@Override
	public Student findByEmail(String email) {
		
		return studentservice.findByEmail(email);
	}
	@Override
	public StudentReportDate calculateextrapoints(List<Attendance> attendance) {
				double percentage=0;
		int canceldays=0;
				int possibledays=0;
				Date meditationdates;
				String blocktype="";
				int count=0;
				List<StudentReportDate> finalreport=new ArrayList<>();
				List<Date> alldates=new ArrayList<>();
		
		for(Attendance atendno:	attendance) {
			 count= attendance.size();
						canceldays=	atendno.getBlock().getCanceledDays();
						blocktype= atendno.getBlock().getSession().getType();
												alldates.add(atendno.getAttendanceDate());
						
		}
		System.out.println(count+"++++++"+blocktype);
			if(blocktype.equals("2 weeks"))
			{
				int totaldays=10-canceldays;
				percentage= (100*count/totaldays);
				possibledays=10;
				System.out.println(count+"++++++"+percentage+"2week" );
										}
			if(blocktype.equals("4 weeks"))
			{
				int totaldays=22-canceldays;
				percentage= (100*count/totaldays);
								possibledays=22;
								System.out.println(count+"++++++"+percentage+"4week" );
								
				}
			StudentReportDate result=	new StudentReportDate(percentage,possibledays,count);
			result.setDateofmed(alldates);
							
					
		
		return result;
	}

}
