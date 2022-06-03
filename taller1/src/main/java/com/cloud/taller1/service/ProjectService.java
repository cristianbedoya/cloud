package com.cloud.taller1.service;

import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.persistence.entity.ProjectTask;
import com.cloud.taller1.service.dto.ProjectDTO;
import com.cloud.taller1.service.dto.ProjectTaskDTO;

public interface ProjectService {

   Project save(ProjectDTO projectDTO);

   ProjectTask saveTask(ProjectTaskDTO projectTaskDTO);
}
