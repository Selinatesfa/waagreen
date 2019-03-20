package waa.green.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import waa.green.model.Location;

public interface LocationRepository extends CrudRepository<Location,Long> {
    Location getLocationByShortName(String name);
}
