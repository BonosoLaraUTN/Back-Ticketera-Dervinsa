package com.ticketera.backticketeradervinsa.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ticketera.backticketeradervinsa.domain.enums.Estado;
import com.ticketera.backticketeradervinsa.domain.enums.Prioridad;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    private Date fechaCierre;
    private Estado estado;
    private Prioridad prioridad;

    @ManyToOne
    @JoinColumn(name = "requerimiento_id")
    @JsonIgnoreProperties({"tickets"})
    private Requerimiento requerimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnoreProperties({"tickets","area", "ticketsAsignados"})
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "asignado_id")
    @JsonIgnoreProperties({"tickets","area", "ticketsAsignados"})
    private Usuario asignado;

    @OneToMany(mappedBy = "ticket",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @Builder.Default
    @JsonIgnoreProperties({"ticket"})
    private Set<Comentario> comentarios = new HashSet<>();

}
