package waa.green.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.green.model.Attendance;
import waa.green.model.Block;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
	@Query(value="select a from Attendance a where :course MEMBER OF a.students.courses and a.block=:block")
	public List<Attendance> generatereportbycourseandblock(String course, String block);
	
}
