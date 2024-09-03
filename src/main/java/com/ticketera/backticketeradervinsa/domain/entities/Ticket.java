package com.ticketera.backticketeradervinsa.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ticketera.backticketeradervinsa.domain.enums.Estado;
import com.ticketera.backticketeradervinsa.domain.enums.Prioridad;
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
    private Date fechaCreacion;
    private Estado estado;
    private Prioridad prioridad;

    @ManyToOne
    @JoinColumn(name = "requerimiento_id")
    @JsonIgnoreProperties({"tickets"})
    private Requerimiento requerimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnoreProperties({"tickets","area"})
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "asignado_id")
    @JsonIgnoreProperties({"tickets","area"})
    private Usuario asignado;

}
