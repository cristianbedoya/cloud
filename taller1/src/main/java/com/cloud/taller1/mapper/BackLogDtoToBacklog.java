package com.cloud.taller1.mapper;

import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.persistence.entity.Project;
import com.cloud.taller1.service.dto.BacklogDTO;
import org.springframework.stereotype.Component;

@Component
public class BackLogDtoToBacklog implements IMapper<BacklogDTO, Backlog> {


    @Override
    public Backlog map(BacklogDTO in) {

        Backlog backlog = new Backlog();

        backlog.setId(in.getId());
        backlog.setProyectIdentifier(in.getProyectIdentifier());
        Project project = new Project();
        project.setId(in.getProject().getId());

        return backlog;
    }
}
