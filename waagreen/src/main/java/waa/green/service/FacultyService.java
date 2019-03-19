package waa.green.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.Course;

public interface FacultyService {

public List<Attendance> generatereportbycourseandblock(Course coures,Date block);
public List<Block> getAllBlock();
public List<Course> getAllCourse();
public double calculateextrapoints(List<Attendance> attendance);
public Optional<Course> findById(Long id);

}
