package com.cloud.taller1.persistence.repository;

import com.cloud.taller1.persistence.entity.Backlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog,Long> {

}
