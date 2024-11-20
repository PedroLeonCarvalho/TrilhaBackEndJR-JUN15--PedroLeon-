package com.secured_template.service;

import com.secured_template.domain.Task;
import com.secured_template.dto.TaskDto;
import com.secured_template.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskService {

private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void createTask(TaskDto dto) {

       dto.setStartDateTime(LocalDateTime.now());

        Task task = new Task(dto.getId(),
                dto.getUserId(),
                dto.getTitle(),
                dto.getDescription(),
                dto.getStartDateTime(),
                dto.getDeadLine(),
                dto.isFinished());

        taskRepository.save(task);
    }


    public void updateTask(Long id, TaskDto dto) {

        var task = taskRepository.findTaskById(id);

       task.setUserId(dto.getUserId());
            task.setTitle(dto.getTitle());
            task.setDescription(dto.getDescription());
            task.setStartDateTime(dto.getStartDateTime());
            task.setDeadLine(dto.getDeadLine());
            task.setFinished( dto.isFinished());

        taskRepository.save(task);
    }
}

