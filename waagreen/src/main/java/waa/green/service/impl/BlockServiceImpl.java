package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Attendance;
import waa.green.model.Block;
import waa.green.model.BlockReportData;
import waa.green.model.Student;
import waa.green.repository.BlockRepository;
import waa.green.service.AttendanceService;
import waa.green.service.BlockService;

import java.util.*;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockRepository blockRepository;
    @Autowired
    private AttendanceService attendanceService;

    @Override
    public List<Block> findAllBlocks() {
        return blockRepository.findAll();
    }

    @Override
    public Block getBlockBetween(Date date) {
        return blockRepository.getBlockBetween(date);
    }


    @Override
    public List<BlockReportData> getBlockReportData(Block block, Student student) {
        List<BlockReportData> blockReportDataList = new ArrayList<>();

        Date startDate, endDate;
        startDate = block.getStartDate();
        endDate = block.getEndDate();
        List<Date> datesInRange = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(endDate);
        while (calendar.before(endCalendar)) {
            Date date = calendar.getTime();
            Attendance attendance = attendanceService.findAttendanceForBlockReport(block.getId(), student.getId(), date);
            blockReportDataList.add(new BlockReportData(date, attendance==null? false:true));
            calendar.add(Calendar.DATE, 1);
        }

        return blockReportDataList;
    }

    @Override
    public Block getBlockByNumnerOfBlock(String block) {
        return blockRepository.getBlockByNumnerOfBlock(block);
    }
}
