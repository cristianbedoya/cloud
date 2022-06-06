package com.cloud.taller1.service;

import com.cloud.taller1.mapper.BackLogDtoToBacklog;
import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.persistence.repository.BacklogRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Optional;


@SpringBootTest
class BacklogServiceImplTest {


    private BacklogService backlogService;
    @Mock
    private BacklogRepository backlogRepository;
    private BackLogDtoToBacklog mapper;

    @BeforeEach
    public void begin() {
        MockitoAnnotations.openMocks(this);
        backlogService = new BacklogServiceImpl(mapper,backlogRepository);

        Backlog backlog = Backlog.builder()
                .id(4L)
                .proyectIdentifier("prueba")
                .project(Project.builder().id(1L).build()).build();
        Mockito.when(backlogRepository.findById(4L))
                .thenReturn(Optional.of(backlog));
    }

    @Test
    public void when_findById_return_Backlog() {

        Backlog backlog = backlogService.findById(4L);
        Assertions.assertEquals("prueba",backlog.getProyectIdentifier());
    }



}