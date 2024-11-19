package com.secured_template.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "user_id", unique = true)
    private Long userId;

    @Column(unique = true)
    private String title;

    private String description;

    @Column(name = "start_date_time")
    private LocalDateTime startDateTime;
    @Column(name = "dead_line")
    private Date deadLine;

    @Column(name = "finished")
    private boolean isFinished;




}
