package com.cloud.taller1.persistence.repository;

import com.cloud.taller1.persistence.entity.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTaskRepository  extends JpaRepository<ProjectTask,Long> {

    List<ProjectTask> findAllByProjectIdentifier(String projectIdentifier);

    @Modifying
    @Query("update ProjectTask u set u.status = :status where u.id = :id and u.projectIdentifier = :projectIdentifier")
    void updateStatus(@Param(value = "id") long id, @Param(value = "projectIdentifier") String projectIdentifier, @Param(value = "status") String status);
}
