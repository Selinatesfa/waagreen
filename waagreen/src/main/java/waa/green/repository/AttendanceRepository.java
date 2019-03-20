package waa.green.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.Course;
import waa.green.model.EntryReportData;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Date;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
    @Query(value = "SELECT * FROM ATTENDANCE ATTEND \n" +
    		"INNER JOIN BLOCK BL ON ATTEND.BLOCK_ID = BL.BLOCK_ID\n" +
    		"INNER JOIN STUDENT STD ON ATTEND.STUDENT_ID = STD.STUDENT_ID\n" +
    		"INNER JOIN COURSE_STUDENT CS ON STD.STUDENT_ID = CS.STUDENT_ID\n" +
    		"INNER JOIN COURSE COR ON CS.ID = COR.ID\n" +
    		"WHERE COR.ID = 1 AND BL.START_DATE = '2018-08-09'\n" +
    		"GROUP BY ATTEND.STUDENT_ID;", nativeQuery=true)
    public List<Attendance> generatereportbycourseandblock(Course course, Date block);

//    @Query(value = "SELECT \n" +
//            "\tCD.STUDENT_ID AS student_id,\n" +
//            "\tSTD.FIRST_NAME AS name,\n" +
//            "\t(SUM(ATTEND.PRESENT) * 100 / SUM(W_S.DAYS)) AS percentage, \n" +
//            "\tSUM(ATTEND.PRESENT) AS total, \n" +
//            "\tSUM(W_S.DAYS) AS possible\n" +
//            "FROM ATTENDANCE ATTEND \n" +
//            "\tINNER JOIN STUDENT STD ON ATTEND.STUDENT_ID = STD.STUDENT_ID\n" +
//            "\tINNER JOIN CODE CD ON STD.CODE_ID = CD.CODE_ID \n" +
//            "\tINNER JOIN BLOCK ON ATTEND.BLOCK_ID = BLOCK.BLOCK_ID\n" +
//            "\tINNER JOIN WEEK_SESSION  W_S ON BLOCK.SESSION_ID= W_S .SESSION_ID\n" +
//            "WHERE STD.ENTRY = 4\n" +
//            "GROUP BY STD.STUDENT_ID", nativeQuery = true)
	@Query(value = "SELECT \n" +
			"\t*\n" +
			"FROM ATTENDANCE ATTEND \n" +
			"\tINNER JOIN STUDENT STD ON ATTEND.STUDENT_ID = STD.STUDENT_ID\n" +
			"\tINNER JOIN CODE CD ON STD.CODE_ID = CD.CODE_ID \n" +
			"\tINNER JOIN BLOCK ON ATTEND.BLOCK_ID = BLOCK.BLOCK_ID\n" +
			"\tINNER JOIN WEEK_SESSION  W_S ON BLOCK.SESSION_ID= W_S .SESSION_ID\n" +
			"WHERE STD.ENTRY = ?1", nativeQuery = true)
    public List<Attendance> generateReportByEntry(Long entryId);


    public List<Attendance> findAttendanceByStudentId(@Param("id") Long id);

}
