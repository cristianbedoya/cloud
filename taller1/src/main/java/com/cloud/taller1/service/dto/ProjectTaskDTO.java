package com.cloud.taller1.service.dto;

import java.sql.Date;
import lombok.Data;

@Data
public class ProjectTaskDTO {

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
    private BacklogDTO backlog;

}
