package com.cloud.taller1.service;

import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.service.dto.BacklogDTO;

public interface BacklogService {

    Backlog save(BacklogDTO backlogDTO);

    Backlog findById(Long id);
}
