package waa.green.service;

import waa.green.model.Location;

public interface LocationService {
    Location getLocationByShortName(String name);
    Location findById(long id);
}
