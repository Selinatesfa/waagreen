package waa.green.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.Course;
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
	public List<Attendance> generatereportbycourseandblock(String coures, String block) {
		
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

	

}
