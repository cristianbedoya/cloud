package com.cloud.taller1.persistence.repository;

import com.cloud.taller1.persistence.entity.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectTaskRepository  extends JpaRepository<ProjectTask,Long> {
}
