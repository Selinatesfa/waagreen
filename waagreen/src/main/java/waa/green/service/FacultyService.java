package waa.green.service;

import java.util.List;

import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.Course;

public interface FacultyService {

public List<Attendance> generatereportbycourseandblock(String coures,String block);
public List<Block> getAllBlock();
public List<Course> getAllCourse();

}
