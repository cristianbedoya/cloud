package com.cloud.taller1.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "ProjectTask")
public class ProjectTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String summary;
    private String acceptanceCriteria;
    private String status;
    private int priority;
    private Double hours;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;
    @ManyToOne
    private Backlog backlog;

}
