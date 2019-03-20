package waa.green.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.Course;
import waa.green.model.PercentageExtrapoint;

public interface FacultyService {

public List<Attendance> generatereportbycourseandblock(Course coures,String block);
public List<Block> getAllBlock();
public List<Course> getAllCourse();
public List<PercentageExtrapoint> calculateextrapoints(List<Attendance> attendance);
public Optional<Course> findById(Long id);

}
