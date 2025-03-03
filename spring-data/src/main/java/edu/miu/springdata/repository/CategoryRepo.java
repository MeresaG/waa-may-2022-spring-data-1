package edu.miu.springdata.repository;

import edu.miu.springdata.entity.bidirectional.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
