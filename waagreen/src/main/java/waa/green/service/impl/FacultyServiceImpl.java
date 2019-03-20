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
	public List<Attendance> generatereportbycourseandblock(Course coures, String block) {
		
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
	public List<PercentageExtrapoint> calculateextrapoints(List<Attendance> attendance) {
		double extrapoints=0;
		double percentage=0;
		int possibledays=0;
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
			
			if((hashresult.get(atendno).get(0)).getBlock().getSession().getType().equals("2 weeks"))
			{
				possibledays=10;
				percentage= (100*count/10);
				
			}
			if((hashresult.get(atendno).get(0)).getBlock().getSession().getType().equals("4 weeks"))
			{
				percentage= (100*count/22);
				possibledays=22;
				
			}
			if(percentage>=70 && percentage <80) {
				extrapoints=0.5;
			}
if(percentage>=80 && percentage <90) {
				extrapoints=1;
			}
if(percentage>=90 ) {
	extrapoints=1.5;
	
}		
			finalreport.add(new PercentageExtrapoint(percentage,extrapoints,atendno,count,possibledays));
			
		}
		return finalreport;
	}

	@Override
	public Optional<Course> findById(Long id) {
		
		return courserepository.findById(id);
	}

	

}
