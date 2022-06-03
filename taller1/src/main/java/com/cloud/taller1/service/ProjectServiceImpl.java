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
}
