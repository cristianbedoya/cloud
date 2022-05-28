package com.cloud.taller1.persistence.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Backlog")
public class Backlog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String proyectIdentifier;
    @OneToOne
    private Project project;
    @OneToMany
    private List<ProjectTask> projectTask;
}
