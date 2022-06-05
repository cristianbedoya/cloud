package com.cloud.taller1.service.dto;

import java.sql.Date;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ProjectDTO {

    private Long id;
    @NotEmpty(message = "El projectName no puede ser vacio")
    private String projectName;
    @NotEmpty(message = "El projectIdentifier no puede ser vacio")
    private String projectIdentifier;
    @NotEmpty(message = "El description no puede ser vacio")
    private String description;
    private Date startDate;
    private Date endDate;

    private BacklogDTO backlog;
}
