package com.cloud.taller1.service;


import com.cloud.taller1.mapper.ProjectDtoToProject;
import com.cloud.taller1.mapper.ProjectTaskDtoToProjectTask;
import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.persistence.entity.ProjectTask;
import com.cloud.taller1.persistence.repository.ProjectRepository;
import com.cloud.taller1.persistence.repository.ProjectTaskRepository;
import com.cloud.taller1.service.dto.ProjectDTO;
import com.cloud.taller1.service.dto.ProjectTaskDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepository projectRepository;
    private final ProjectTaskRepository projectTaskRepository;
    private final ProjectDtoToProject mapper;
    private final ProjectTaskDtoToProjectTask mapperTask;

    @Override
    public Project save(ProjectDTO projectDTO) {

        Project project = mapper.map(projectDTO);
        project = projectRepository.save(project);
        return project;
    }

    @Override
    public ProjectTask saveTask(ProjectTaskDTO projectTaskDTO) {

        ProjectTask projectTask = mapperTask.map(projectTaskDTO);
        projectTask = projectTaskRepository.save(projectTask);
        return projectTask;
    }

    @Override
    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    @Override
    public List<ProjectTask> getAllTaskByProjectIdentifier(String projectIdentifier) {

        return projectTaskRepository.findAllByProjectIdentifier(projectIdentifier);
    }

    @Override
    public Double getTotalHoursByProjectIdentifier(String projectIdentifier) {

        List<ProjectTask> projectTasks = projectTaskRepository.findAllByProjectIdentifier(projectIdentifier);

        Double totalHours= 0D;

        for (ProjectTask project : projectTasks ) {
            if(!project.getStatus().equalsIgnoreCase("deleted"))
                totalHours += project.getHours();
        }

        return totalHours;
    }

    @Override
    public Double getTotalHoursByProjectIdentifierAndStatus(String projectIdentifier, String status) {
        List<ProjectTask> projectTasks = projectTaskRepository.findAllByProjectIdentifier(projectIdentifier);

        Double totalHours= 0D;

        for (ProjectTask project : projectTasks ) {
            if(project.getStatus().equalsIgnoreCase(status))
                totalHours += project.getHours();
        }

        return totalHours;
    }

    @Override
    public void deleteTaskProjectIdentifier(Long idtask, String projectIdentifier) {

        Optional<ProjectTask> projectTaskOptional = projectTaskRepository.findById(idtask);
        if(projectTaskOptional.isPresent() && projectTaskOptional.get().getProjectIdentifier().equalsIgnoreCase(projectIdentifier))
        {
            ProjectTask projectTask = projectTaskOptional.get();
            projectTask.setStatus("deleted");
            projectTaskRepository.save(projectTask);
        }
        //projectTaskRepository.updateStatus(idtask,projectIdentifier,"deleted");
    }
}
