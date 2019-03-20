package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Location;
import waa.green.repository.LocationRepository;
import waa.green.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository locationRepository;
    @Override
    public Location getLocationByShortName(String name) {
        return locationRepository.getLocationByShortName(name);
    }

    @Override
    public Location findById(long id) {
        return locationRepository.findById(id).get();
    }
}
