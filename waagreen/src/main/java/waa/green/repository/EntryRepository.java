package waa.green.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.green.model.Entry;

import java.util.Date;
import java.util.List;
@Repository
public interface EntryRepository extends CrudRepository<Entry,Long> {
       public List<Entry> findAll();
       Entry findEntryByMonthYear(String monthYear);

}
