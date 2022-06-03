package com.cloud.taller1.controller;

import com.cloud.taller1.helpers.Response;
import com.cloud.taller1.helpers.ResponseBuild;
import com.cloud.taller1.persistence.entity.Backlog;
import com.cloud.taller1.service.BacklogService;
import com.cloud.taller1.service.dto.BacklogDTO;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/backlogs")
@RequiredArgsConstructor
public class BacklogController {

    private final BacklogService backlogService;
    private final ResponseBuild builder;

    @PostMapping
    public Response createBacklog(@RequestBody BacklogDTO backlogDTO)
    {
        Backlog backlog = backlogService.save(backlogDTO);

        return builder.created(backlog);
    }

}
