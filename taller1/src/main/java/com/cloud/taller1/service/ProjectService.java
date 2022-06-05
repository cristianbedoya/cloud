package com.cloud.taller1.service;

import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.persistence.entity.ProjectTask;
import com.cloud.taller1.service.dto.ProjectDTO;
import com.cloud.taller1.service.dto.ProjectTaskDTO;

import java.util.List;

public interface ProjectService {

   Project save(ProjectDTO projectDTO);

   ProjectTask saveTask(ProjectTaskDTO projectTaskDTO);

    List<Project> getAll();

    List<ProjectTask> getAllTaskByProjectIdentifier(String projectIdentifier);

    Double getTotalHoursByProjectIdentifier(String projectIdentifier);

    Double getTotalHoursByProjectIdentifierAndStatus(String projectIdentifier, String status);

    void deleteTaskProjectIdentifier(Long idtask, String projectIdentifier);

    Project findById(Long id);
}
