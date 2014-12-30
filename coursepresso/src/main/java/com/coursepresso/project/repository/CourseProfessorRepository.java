package com.coursepresso.project.repository;

import com.coursepresso.project.entity.CourseProfessor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caleb Miller
 */
@Repository
public interface CourseProfessorRepository extends CrudRepository<CourseProfessor, Integer> {
  
}
