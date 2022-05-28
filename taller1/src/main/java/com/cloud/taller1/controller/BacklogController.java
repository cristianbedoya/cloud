package com.cloud.taller1.controller;

import com.cloud.taller1.service.dto.BacklogDTO;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/backlogs")
@RequiredArgsConstructor
public class BacklogController {



    @PostMapping
    public void createBacklog(@RequestBody BacklogDTO backlogDTO)
    {

    }

}
