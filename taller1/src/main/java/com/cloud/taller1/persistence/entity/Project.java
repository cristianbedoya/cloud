package com.cloud.taller1.persistence.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "El projectName no puede ser vacio")
    private String projectName;
    @NotEmpty(message = "El projectIdentifier no puede ser vacio")
    private String projectIdentifier;
    @NotEmpty(message = "El description no puede ser vacio")
    private String description;
    private Date startDate;
    private Date endDate;
    @OneToOne
    private Backlog backlog;

}
