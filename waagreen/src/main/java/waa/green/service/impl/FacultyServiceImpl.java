package waa.green.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.Course;
import waa.green.model.PercentageExtrapoint;
import waa.green.model.Student;
import waa.green.repository.AttendanceRepository;
import waa.green.repository.BlockRepository;
import waa.green.repository.CourseRepository;
import waa.green.service.FacultyService;
@Service
public class FacultyServiceImpl implements FacultyService {
@Autowired
	AttendanceRepository attendacerepositort;
@Autowired
BlockRepository blockrepository;
@Autowired
CourseRepository courserepository;
	
	@Override
	public List<Attendance> generatereportbycourseandblock(Course coures, Date block) {
		
		return attendacerepositort.generatereportbycourseandblock(coures, block);
	//return null;
	}

	@Override
	public List<Block> getAllBlock() {
		
		return blockrepository.findAll();
	}

	@Override
	public List<Course> getAllCourse() {
		return courserepository.findAll();
	}

	@Override
	public double calculateextrapoints(List<Attendance> attendance) {
		double extrapoints;
		double percentage;
		List<PercentageExtrapoint> finalreport=new ArrayList<>(); 
		HashMap<Student,List<Attendance>> hashresult=new HashMap<>();
		
		for(Attendance attend: attendance) {
			
			if(!hashresult.containsKey(attend.getStudent())) {
				
				List<Attendance> list=new ArrayList();
								list.add(attend);
				hashresult.put(attend.getStudent(), list);
			}
			else {
				hashresult.get(attend.getStudent()).add(attend);
			}
		}
		for(Student atendno:	hashresult.keySet()) {
			int count= hashresult.get(atendno).size();
			if((hashresult.get(atendno).get(0)).getBlock().getSession().getType()=="two week")
			{
				
			}
			if((hashresult.get(atendno).get(0)).getBlock().getSession().getType()=="four week")
			{
				
			}
			
			finalreport.add(new PercentageExtrapoint());
			
		}
		return 0;
	}

	@Override
	public Optional<Course> findById(Long id) {
		
		return courserepository.findById(id);
	}

	

}
