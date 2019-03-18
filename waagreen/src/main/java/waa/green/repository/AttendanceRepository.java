package waa.green.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.green.model.Attendance;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
}
