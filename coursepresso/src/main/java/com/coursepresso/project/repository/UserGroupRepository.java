package com.coursepresso.project.repository;

import com.coursepresso.project.entity.UserGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caleb Miller
 */
@Repository
public interface UserGroupRepository extends CrudRepository<UserGroup, Integer> {
  
}
