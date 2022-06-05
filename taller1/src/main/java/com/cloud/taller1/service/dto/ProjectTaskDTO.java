package com.cloud.taller1.service.dto;

import java.sql.Date;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class ProjectTaskDTO {

    @NotEmpty(message = "El id no puede ser vacio")
    private Long id;
    @NotEmpty(message = "El name no puede ser vacio")
    private String name;
    @NotEmpty(message = "El summary no puede ser vacio")
    private String summary;
    private String acceptanceCriteria;
    private String status;
    @Min(1)
    @Max(5)
    private int priority;
    @Min(1)
    @Max(8)
    private Double hours;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;
    private BacklogDTO backlog;

}
