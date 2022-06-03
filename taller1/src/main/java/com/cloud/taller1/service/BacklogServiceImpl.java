package com.cloud.taller1.service;

import com.cloud.taller1.mapper.BackLogDtoToBacklog;
import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.persistence.repository.BacklogRepository;
import com.cloud.taller1.service.dto.BacklogDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BacklogServiceImpl implements BacklogService {

    private final BackLogDtoToBacklog mapper;
    private final BacklogRepository backlogRepository;

    @Override
    public Backlog save(BacklogDTO backlogDTO) {

        Backlog backlog = mapper.map(backlogDTO);
        backlog = backlogRepository.save(backlog);
        return backlog;
    }
}
