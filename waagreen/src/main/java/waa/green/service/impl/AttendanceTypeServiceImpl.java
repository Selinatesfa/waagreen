package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.AttendanceType;
import waa.green.repository.AttendanceTypeRepository;
import waa.green.service.AttendanceTypeService;

import java.util.List;

@Service
public class AttendanceTypeServiceImpl implements AttendanceTypeService {
    @Autowired
    AttendanceTypeRepository attendanceTypeRepository;

    @Override
    public List<AttendanceType> getAll() {
        return (List<AttendanceType>) attendanceTypeRepository.findAll();
    }
}
