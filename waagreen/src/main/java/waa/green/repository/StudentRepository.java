package waa.green.repository;

import org.springframework.data.repository.CrudRepository;

import waa.green.model.Student;

public interface StudentRepository extends CrudRepository<Student , Long>{

}
