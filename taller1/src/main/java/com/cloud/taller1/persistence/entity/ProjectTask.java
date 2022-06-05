package com.cloud.taller1.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "ProjectTask")
public class ProjectTask {

    @Id
    @NotEmpty(message = "El id no puede ser vacio")
    private Long id;
    @NotEmpty(message = "El name no puede ser vacio")
    private String name;
    @NotEmpty(message = "El summary no puede ser vacio")
    private String summary;
    private String acceptanceCriteria;
    private String status;
    @Min(1)
    @Max(5)
    private int priority;
    @Min(1)
    @Max(8)
    private Double hours;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;
    @ManyToOne
    private Backlog backlog;

}
