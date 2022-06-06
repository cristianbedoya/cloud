package com.cloud.taller1.persistence.repository;

import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.persistence.entity.Project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
class BacklogRepositoryTest {

    @Autowired
    private BacklogRepository backlogRepository;

    @Test
    public void when_findByBacklog()
    {
        Backlog backlog = Backlog.builder()
                .proyectIdentifier("prueba")
                .project(Project.builder().id(1L).build()).build();

        Backlog backlogResponseDB = backlogRepository.save(backlog);

        Optional<Backlog> backlogRes = backlogRepository.findById(backlogResponseDB.getId());
        backlogRes.ifPresent(value -> Assertions.assertEquals(backlog.getProyectIdentifier(), value.getProyectIdentifier()));
    }
}