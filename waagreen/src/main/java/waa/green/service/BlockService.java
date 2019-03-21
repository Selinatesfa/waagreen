package waa.green.service;

import waa.green.model.Block;
import waa.green.model.BlockReportData;
import waa.green.model.Student;

import java.util.Date;
import java.util.List;

public interface BlockService {
    List<Block> findAllBlocks();
    Block getBlockBetween(Date date);
    public List<BlockReportData> getBlockReportData(Block blocks, Student student);
    Block getBlockByNumnerOfBlock(String block);
}
