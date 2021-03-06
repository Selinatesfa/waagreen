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
import waa.green.model.Student;

import java.util.Date;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {


    @Query(value = "SELECT * FROM ATTENDANCE ATTEND \n" + 
    		"INNER JOIN BLOCK BL ON ATTEND.BLOCK_ID = BL.BLOCK_ID\n" + 
    		"INNER JOIN STUDENT STD ON ATTEND.STUDENT_ID = STD.STUDENT_ID\n" + 
    		"INNER JOIN COURSE_STUDENT CS ON STD.STUDENT_ID = CS.STUDENT_ID\n" + 
    		"INNER JOIN COURSE COR ON CS.ID = COR.ID\n" + 
    		"WHERE COR.ID = ?1 AND BL.NUMBER_OF_BLOCK = ?2\n" , nativeQuery=true)
    public List<Attendance> generatereportbycourseandblock(Course course, String block);

	@Query(value = "SELECT \n" +
			"\t*\n" +
			"FROM ATTENDANCE ATTEND \n" +
			"\tINNER JOIN STUDENT STD ON ATTEND.STUDENT_ID = STD.STUDENT_ID\n" +
			"\tINNER JOIN CODE CD ON STD.CODE_ID = CD.CODE_ID \n" +
			"\tINNER JOIN BLOCK ON ATTEND.BLOCK_ID = BLOCK.BLOCK_ID\n" +
			"\tINNER JOIN WEEK_SESSION  W_S ON BLOCK.SESSION_ID= W_S .SESSION_ID\n" +
			"WHERE STD.ENTRY = ?1", nativeQuery = true)
    List<Attendance> generateReportByEntry(Long entryId);

   // @Query(value="select a from Attendance a join Student s where a.Student_id=:id")
    public List<Attendance> findAttendanceByStudentId(@Param("id") Long id);
    @Query(value = "SELECT * FROM ATTENDANCE ATTEND \n" + 
    		"INNER JOIN BLOCK BL ON ATTEND.BLOCK_ID = BL.BLOCK_ID \n" + 
    		"INNER JOIN STUDENT STD ON ATTEND.STUDENT_ID = STD.STUDENT_ID \n" + 
    		"INNER JOIN COURSE_STUDENT CS ON STD.STUDENT_ID = CS.STUDENT_ID \n" + 
    		"INNER JOIN COURSE COR ON CS.ID = COR.ID\n" + 
    		"WHERE STD.STUDENT_ID = ?1 AND BL.NUMBER_OF_BLOCK = ?2", nativeQuery=true)
    public List<Attendance> generatereportbyblock(Long studentid,String block);

    @Query(value="SELECT * FROM ATTENDANCE AT \n" +
            "INNER JOIN STUDENT ST ON AT.STUDENT_ID = ST.STUDENT_ID\n" +
            "INNER JOIN BLOCK BL ON AT.BLOCK_ID = BL.BLOCK_ID\n" +
            "WHERE BL.BLOCK_ID = :id AND ST.STUDENT_ID = :studentId", nativeQuery = true)
    public List<Attendance> findAttendanceByStudentId(@Param("id") Long id, long studentId);

    @Query(value = "select a from Attendance a where a.block.id=:block_id and a.student.id=:student_id and a.attendanceDate=:date")
	Attendance findAttendanceForBlockReport(long block_id, long student_id, Date date);
}
