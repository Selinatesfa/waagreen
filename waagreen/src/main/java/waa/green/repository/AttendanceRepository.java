package waa.green.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.green.model.Attendance;
import waa.green.model.Block;

import java.util.Date;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
<<<<<<< HEAD
	@Query(value="select a from Attendance a ")
		//	+ "where :course MEMBER OF a.student.courses and a.block=:block.startDate")
=======
	@Query(value="select a from Attendance a")
			//+ "a where :course MEMBER OF a.student.courses and a.block=:block.startDate")
>>>>>>> branch 'master' of https://selina.tesfabrhan%40gmail.com@github.com/Selinatesfa/waagreen.git
		public List<Attendance> generatereportbycourseandblock(String course, String block);

<<<<<<< HEAD
    @Query(value = "select a from Attendance a where a.student.entry.monthYear =:dateOfEntry")
    public List<Attendance> generateReportByEntry(String dateOfEntry);
=======
    @Query(value = "select a from Attendance a where a.student.entry.monthYear =: monthYear")
    public List<Attendance> generateReportByEntry(String monthYear);
>>>>>>> branch 'master' of https://selina.tesfabrhan%40gmail.com@github.com/Selinatesfa/waagreen.git
}
