package com.cloud.taller1.service.dto;

import java.sql.Date;
import lombok.Data;

@Data
public class ProjectDTO {

    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date startDate;
    private Date endDate;

    private BacklogDTO backlog;
}
