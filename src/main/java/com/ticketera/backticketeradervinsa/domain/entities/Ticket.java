package com.ticketera.backticketeradervinsa.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ticketera.backticketeradervinsa.domain.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Ticket extends Base {

    private String titulo;
    private String descripcion;
    private Date fecha_creacion;
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "requerimiento_id")
    @JsonBackReference
    private Requerimiento requerimiento;

}
