package waa.green.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import waa.green.model.Block;
import waa.green.model.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course, Long>{
	public List<Course> findAll();
}
