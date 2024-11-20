package com.secured_template.service;

import com.secured_template.domain.Task;
import com.secured_template.dto.TaskDto;
import com.secured_template.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class TaskService {

private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void createTask(TaskDto dto) {

       dto.setStartDateTime(LocalDateTime.now());
        taskRepository.save(  dto.toEntity());
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

    public void deleteTask(Long id) {
       var task = taskRepository.findTaskById(id);
        task.setActive(false);
        taskRepository.save(task);
        }

    public List<TaskDto> listTasks() {
        var taskList =taskRepository.findAllActiveTrue();

        return
        taskList.stream().map(task -> new TaskDto(
                task.getId(),
                task.getUserId(),
                task.getTitle(),
                task.getDescription(),
                task.getStartDateTime(),
                task.getDeadLine(),
                task.isFinished(),
                task.isActive()
                ))
                .toList();


    }

}

