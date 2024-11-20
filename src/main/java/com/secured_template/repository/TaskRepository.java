package com.secured_template.repository;

import com.secured_template.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {


    Task findTaskById(Long id);

    @Query (" SELECT t FROM Task t WHERE t.isActive = TRUE")
    List<Task> findAllActiveTrue();
}
