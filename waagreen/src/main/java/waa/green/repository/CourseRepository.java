package waa.green.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import waa.green.model.Block;
import waa.green.model.Course;
@Repository
public interface CourseRepository<L, L1 extends Number> extends CrudRepository<Course, Long>{
	public List<Course> findAll();
	public Optional<Course> findById(Long id);
}
