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


}
