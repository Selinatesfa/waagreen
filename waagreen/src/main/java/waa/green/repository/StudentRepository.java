package waa.green.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.green.model.Student;

import java.util.Date;
import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
    @Query(value = "select a.student.dateOfEntry from Attendance a ")
    public List<Date> findallDateOfEntry();
}
