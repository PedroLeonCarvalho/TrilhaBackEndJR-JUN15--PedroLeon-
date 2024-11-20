package com.secured_template.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Getter
@Setter
public class TaskDto implements Serializable {

        private Long id;
        private Long userId;
        private String title;
        private String description;
        private LocalDateTime startDateTime;
        private Date deadLine;
        private  boolean isFinished = false;

}
