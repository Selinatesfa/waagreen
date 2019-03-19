package waa.green.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.green.model.Entry;

import java.util.Date;
import java.util.List;
@Repository
public interface EntryRepository extends CrudRepository<Entry,Long> {
    @Query(value = "select a.student.entry.montYear from Attendance a ")
    public List<Entry> findAll();
}
