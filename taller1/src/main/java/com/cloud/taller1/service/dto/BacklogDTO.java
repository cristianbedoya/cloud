package com.cloud.taller1.service.dto;

import java.util.List;
import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Data
public class BacklogDTO {


    private Long id;
    @NotEmpty(message = "El proyectIdentifier no puede ser vacio")
    private String proyectIdentifier;
    private ProjectDTO project;
    private List<ProjectTaskDTO> projectTask;
}
