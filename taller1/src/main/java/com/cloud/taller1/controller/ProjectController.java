package com.cloud.taller1.controller;


import com.cloud.taller1.service.dto.ProjectDTO;
import com.cloud.taller1.service.dto.ProjectTaskDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {

    @PostMapping
    public void createProject(@RequestBody ProjectDTO projectDTO)
    {

    }

    @PostMapping("/tasks")
    public void createProjectTask(@RequestBody ProjectTaskDTO projectTaskDTO)
    {

    }

    @GetMapping
    public List<ProjectDTO> getAll()
    {
        return null;
    }

    @GetMapping("/tasks/project/{projectIdentifier}")
    public List<ProjectTaskDTO> getProjectTaskAll(@PathVariable("projectIdentifier") Long projectIdentifier)
    {
        return null;
    }

    @GetMapping("/tasks/project/hours/{projectIdentifier}")
    public Double getProjectHoursTaskAll(@PathVariable("projectIdentifier") Long projectIdentifier)
    {
        return null;
    }

    @GetMapping("/tasks/project/hours/{projectIdentifier}/{status}")
    public Double getProjectHoursStatusTaskAll(@PathVariable("projectIdentifier") Long projectIdentifier,@PathVariable("status") String status)
    {
        return null;
    }

    @PatchMapping ("/tasks/{idtask}/{projectIdentifier}")
    public Double getProjectHoursStatusTaskAll(@PathVariable("idtask") Long idtask,@PathVariable("projectIdentifier") Long projectIdentifier)
    {
        return null;
    }
}
