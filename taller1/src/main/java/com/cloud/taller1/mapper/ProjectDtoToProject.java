package com.cloud.taller1.mapper;

import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.service.dto.ProjectDTO;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoToProject implements IMapper<ProjectDTO,Project>{

    @Override
    public Project map(ProjectDTO projectDTO)
    {
        Project project = new Project();

        project.setId(projectDTO.getId());
        project.setProjectName(projectDTO.getProjectName());
        project.setProjectIdentifier(projectDTO.getProjectIdentifier());
        project.setDescription(projectDTO.getDescription());
        project.setStartDate(projectDTO.getStartDate());
        project.setEndDate(projectDTO.getEndDate());

        return project;
    }

}
