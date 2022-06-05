package com.cloud.taller1.controller;

import com.cloud.taller1.helpers.Response;
import com.cloud.taller1.helpers.ResponseBuild;
import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.service.BacklogService;
import com.cloud.taller1.service.ProjectService;
import com.cloud.taller1.service.dto.BacklogDTO;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/backlogs")
@RequiredArgsConstructor
public class BacklogController {

    private final BacklogService backlogService;
    private final ProjectService projectService;
    private final ResponseBuild builder;


    @PostMapping
    public Response createBacklog(@RequestBody BacklogDTO backlogDTO)
    {
        if(backlogDTO.getProject() != null) {
            Project project = projectService.findById(backlogDTO.getProject().getId());
            if(project != null && project.getProjectIdentifier().equalsIgnoreCase(backlogDTO.getProyectIdentifier())){
                Backlog backlog = backlogService.save(backlogDTO);
                return builder.created(backlog);
            }
        }
        return builder.badRequest(backlogDTO);
    }

}
