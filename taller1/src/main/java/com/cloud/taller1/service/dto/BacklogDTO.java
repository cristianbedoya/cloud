package com.cloud.taller1.service.dto;

import java.util.List;
import lombok.Data;

@Data
public class BacklogDTO {


    private Long id;
    private String proyectIdentifier;
    private ProjectDTO project;
    private List<ProjectTaskDTO> projectTask;
}
