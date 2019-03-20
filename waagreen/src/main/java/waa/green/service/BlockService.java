package waa.green.service;

import waa.green.model.Block;

import java.util.Date;
import java.util.List;

public interface BlockService {
    List<Block> findAllBlocks();
    Block getBlockBetween(Date date);
}
