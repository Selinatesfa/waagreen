package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Block;
import waa.green.repository.BlockRepository;
import waa.green.service.BlockService;

import java.util.Date;
import java.util.List;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockRepository blockRepository;
    @Override
    public List<Block> findAllBlocks() {
        return blockRepository.findAll();
    }

    @Override
    public Block getBlockBetween(Date date) {
        return blockRepository.getBlockBetween(date);
    }
}
