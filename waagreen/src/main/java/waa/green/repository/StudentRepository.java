package waa.green.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import waa.green.model.Attendance;
import waa.green.model.Student;

import java.util.Date;
import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

    @Query("SELECT stu FROM Student stu WHERE stu.id =:id")
    Attendance attendanceInfoAccumulative(@Param("id") Long id);
    public Student findBy
}
