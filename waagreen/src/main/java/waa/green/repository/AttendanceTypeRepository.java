package waa.green.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.green.model.AttendanceType;

@Repository
public interface AttendanceTypeRepository extends CrudRepository<AttendanceType, Long> {
}
