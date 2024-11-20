package com.secured_template.controller;

import com.secured_template.dto.TaskDto;
import com.secured_template.dto.UserDto;
import com.secured_template.service.TaskService;
import com.secured_template.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@SecurityRequirement(name = "Authorization")
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

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteTask (@PathVariable(name = "id") Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity ("Tarefa Deletada", HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<TaskDto>> listTasks () {

        return ResponseEntity.ok(taskService.listTasks());
    }
}
