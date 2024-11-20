package com.secured_template.controller;

import com.secured_template.dto.TaskDto;
import com.secured_template.dto.UserDto;
import com.secured_template.service.TaskService;
import com.secured_template.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

  private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    ResponseEntity<TaskDto> createNewTask (@RequestBody TaskDto task) {
        taskService.createTask(task);
        return new ResponseEntity(task, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    ResponseEntity<TaskDto> updateTask (@PathVariable(name = "id") Long id , @RequestBody TaskDto task) {
        taskService.updateTask(id, task);
        return new ResponseEntity(task, HttpStatus.CREATED);
    }
}