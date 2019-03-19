package waa.green.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import waa.green.model.Block;
@Repository
public interface BlockRepository extends CrudRepository<Block, Long>{

public List<Block> findAll();	
}