package waa.green.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import waa.green.model.Block;

@Repository
public interface BlockRepository extends CrudRepository<Block, Long> {
    List<Block> findAll();
    @Query(value = "select b from Block b where b.startDate<= :date AND :date <= b.endDate")
    Block getBlockBetween(Date date);
}