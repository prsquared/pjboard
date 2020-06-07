package com.priyesh.test.board.repository;

import com.priyesh.test.board.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<ProjectTask,Long> {
}
