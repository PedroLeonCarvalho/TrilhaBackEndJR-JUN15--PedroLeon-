package com.secured_template.dto;

import com.secured_template.domain.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto implements Serializable {

        private Long id;
        private Long userId;
        private String title;
        private String description;
        private LocalDateTime startDateTime;
        private Date deadLine;
        private  boolean isFinished = false;
        private boolean isActive = true;

        public Task toEntity() {
                Task task = new Task();
                task.setId(this.id);
                task.setUserId(this.userId);
                task.setTitle(this.title);
                task.setDescription(this.description);
                task.setStartDateTime(this.startDateTime);
                task.setDeadLine(this.deadLine);
                task.setFinished(this.isFinished);
                task.setActive(this.isActive);
                return task;
        }

}
