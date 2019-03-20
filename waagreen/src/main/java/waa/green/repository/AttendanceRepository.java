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

    @Query(value = "select a from Attendance a where a.student.entry.monthYear =:dateOfEntry")
    public List<Attendance> generateReportByEntry(String dateOfEntry);

    @Query(value="SELECT * FROM ATTENDANCE AT \n" +
            "INNER JOIN STUDENT ST ON AT.STUDENT_ID = ST.STUDENT_ID\n" +
            "INNER JOIN BLOCK BL ON AT.BLOCK_ID = BL.BLOCK_ID\n" +
            "WHERE BL.BLOCK_ID = :id AND ST.STUDENT_ID = :studentId", nativeQuery = true)
    public List<Attendance> findAttendanceByStudentId(@Param("id") Long id, long studentId);

}
