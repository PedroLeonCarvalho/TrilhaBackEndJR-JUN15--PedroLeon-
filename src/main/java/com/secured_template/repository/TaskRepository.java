package com.secured_template.repository;

import com.secured_template.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {


    Task findTaskById(Long id);
}
