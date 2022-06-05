package com.cloud.taller1.persistence.entity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Backlog")
public class Backlog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "El proyectIdentifier no puede ser vacio")
    private String proyectIdentifier;
    @OneToOne
    private Project project;
    @OneToMany
    private List<ProjectTask> projectTask;
}
