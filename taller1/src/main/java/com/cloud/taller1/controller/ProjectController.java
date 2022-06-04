package com.cloud.taller1.controller;


import com.cloud.taller1.helpers.Response;
import com.cloud.taller1.helpers.ResponseBuild;
import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.persistence.entity.ProjectTask;
import com.cloud.taller1.service.ProjectService;
import com.cloud.taller1.service.dto.ProjectDTO;
import com.cloud.taller1.service.dto.ProjectTaskDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;
import java.util.List;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {


    private final ResponseBuild builder;
    private final ProjectService projectService;


    @PostMapping
    public Response createProject(@RequestBody ProjectDTO projectDTO)
    {
        Project project = projectService.save(projectDTO);

        return builder.created(project);
    }

    @PostMapping("/tasks")
    public Response createProjectTask(@RequestBody ProjectTaskDTO projectTaskDTO)
    {
        ProjectTask projectTask = projectService.saveTask(projectTaskDTO);

        return builder.created(projectTask);
    }

    @GetMapping
    public Response getAll()
    {
        List<Project> projects = projectService.getAll();

        return builder.success(projects);
    }

    @GetMapping("/tasks/project/{projectIdentifier}")
    public Response getProjectTaskAll(@PathVariable("projectIdentifier") String projectIdentifier)
    {
        List<ProjectTask> projectTasks = projectService.getAllTaskByProjectIdentifier(projectIdentifier);

        return builder.success(projectTasks);
    }

    @GetMapping("/tasks/project/hours/{projectIdentifier}")
    public Response getProjectHoursTaskAll(@PathVariable("projectIdentifier") String projectIdentifier)
    {
        Double totalHours = projectService.getTotalHoursByProjectIdentifier(projectIdentifier);
        return builder.success(totalHours);
    }

    @GetMapping("/tasks/project/hours/{projectIdentifier}/{status}")
    public Response getProjectHoursStatusTaskAll(@PathVariable("projectIdentifier") String projectIdentifier,@PathVariable("status") String status)
    {
        Double totalHours = projectService.getTotalHoursByProjectIdentifierAndStatus(projectIdentifier,status);
        return builder.success(totalHours);
    }

    @PatchMapping ("/tasks/{idtask}/{projectIdentifier}")
    public Response deleteTaskByProjectIdentifier(@PathVariable("idtask") Long idtask,@PathVariable("projectIdentifier") String projectIdentifier)
    {
        try {
            projectService.deleteTaskProjectIdentifier(idtask, projectIdentifier);

            return builder.success();
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return builder.failed(ex);
        }
    }
}
