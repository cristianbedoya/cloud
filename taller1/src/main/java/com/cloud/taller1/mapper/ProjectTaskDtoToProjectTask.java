package com.cloud.taller1.mapper;

import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.persistence.entity.ProjectTask;
import com.cloud.taller1.service.dto.ProjectTaskDTO;
import org.springframework.stereotype.Component;

@Component
public class ProjectTaskDtoToProjectTask implements IMapper<ProjectTaskDTO, ProjectTask>{


    @Override
    public ProjectTask map(ProjectTaskDTO in) {

        ProjectTask projectTask = new ProjectTask();
        projectTask.setId(in.getId());
        projectTask.setProjectIdentifier(in.getProjectIdentifier());
        projectTask.setAcceptanceCriteria(in.getAcceptanceCriteria());
        projectTask.setName(in.getName());
        projectTask.setEndDate(in.getEndDate());
        projectTask.setStartDate(in.getStartDate());
        projectTask.setHours(in.getHours());
        projectTask.setSummary(in.getSummary());
        projectTask.setStatus(in.getStatus());
        projectTask.setPriority(in.getPriority());

        Backlog backlog = new Backlog();
        backlog.setId(in.getBacklog().getId());

        projectTask.setBacklog(backlog);

        return projectTask;
    }
}
